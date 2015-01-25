package br.com.caelum.vraptor.controller;

import java.io.FileNotFoundException;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class IndexController {
	@Inject private Result result;
	
	@Get("/")
	public void index() throws FileNotFoundException {
		Graph graph = ParserText.parse("/home/fernanda/workspace/graph/edges.txt");
		graph.calculateCloseness();
		result.include("paths", graph.vertices);
	}
}