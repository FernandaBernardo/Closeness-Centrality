package br.com.caelum.vraptor.controller;

public class Main {
	public static void main(String[] args) {
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);
		Vertex vertex6 = new Vertex(6);
		Vertex vertex7 = new Vertex(7);
		
		Graph graph = new Graph();
		
		graph.addVertex(vertex1);
		graph.addVertex(vertex2);
		graph.addVertex(vertex3);
		graph.addVertex(vertex4);
		graph.addVertex(vertex5);
		graph.addVertex(vertex6);
		graph.addVertex(vertex7);
		
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
