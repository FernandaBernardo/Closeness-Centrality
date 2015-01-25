package br.com.caelum.vraptor.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParserText {

	public static Graph parse(String text) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(text));
		Graph graph= new Graph();
		while(sc.hasNext()) {
			int id = sc.nextInt();
			graph.addVertex(new Vertex(id));
		}
		
		sc = new Scanner(new File(text));
		
		while(sc.hasNext()) {
			String[] strings = sc.nextLine().split(" ");
			int start = Integer.parseInt(strings[0]);
			int end = Integer.parseInt(strings[1]);
			
			graph.connectVertex(start, end);
		}
		
		return graph;
	}
	
}
