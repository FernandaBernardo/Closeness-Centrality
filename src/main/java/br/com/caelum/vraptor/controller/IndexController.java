package br.com.caelum.vraptor.controller;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller
public class IndexController {
	@Inject private Result result;
	private Graph graph;
	private String file = System.getProperty("user.home") + "/workspace/graph/data/edges.txt";
	
	@Get("/")
	public void index() throws FileNotFoundException {
		graph = ParserText.parse(file);
		graph.calculateCloseness();
		result.use(Results.json()).from(graph.getVertices(), "vertices").exclude("visited").serialize();
	}
	
	@Post("/")
	public void addNewEdge(String edge) throws IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file,true)));
		out.print("\n"+edge);
		out.close();
		result.forwardTo(this).index();
	}
}