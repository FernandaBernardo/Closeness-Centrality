package br.com.caelum.vraptor.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParserText {

	static Graph graph;

	public static Graph parse(String file) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(file));
		graph = new Graph();
		
		while(sc.hasNext()) {
			String[] strings = sc.nextLine().split(" ");
			int start = Integer.parseInt(strings[0]);
			int end = Integer.parseInt(strings[1]);
			
			graph.connectVertex(start, end);
		}
		
		return graph;
	}
}
