package br.com.caelum.vraptor.controller;

public class Main {
	public static void main(String[] args) {
		Graph graph = new Graph();
		
		graph.connectVertex(1, 2);
		graph.connectVertex(1, 3);
		graph.connectVertex(2, 3);
		graph.connectVertex(3, 4);
		graph.connectVertex(4, 5);
		graph.connectVertex(5, 6);
		graph.connectVertex(5, 7);
		
		graph.bfs();
	}		
}
