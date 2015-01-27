package br.com.caelum.vraptor.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
	private List<Vertex> vertices;
	private int[][] adjMatrix;
	private int size;
	
	public Graph() {
		this.vertices = new ArrayList<Vertex>();
	}
	
	public void connectVertex(int start,int end) {
		addVertex(new Vertex(start));
		addVertex(new Vertex(end));
		
		size=vertices.size();
		if(adjMatrix == null) {
			adjMatrix=new int[size][size];
		}
		
		if(adjMatrix.length != vertices.size()) {
			adjMatrix = copyMatrix();
		}
		
		int startIndex = indexOfId(start);
		int endIndex = indexOfId(end);
		adjMatrix[startIndex][endIndex]=1;
		adjMatrix[endIndex][startIndex]=1;
	}
	
	private int[][] copyMatrix() {
		int[][] auxAdjMatrix = new int[size][size];
		for (int i = 0; i < adjMatrix.length; i++) {
			for (int j = 0; j < adjMatrix.length; j++) {
				auxAdjMatrix[i][j] = adjMatrix[i][j];
			}
		}
		return auxAdjMatrix;
	}

	private int indexOfId(int start) {
		for (Vertex v : vertices) {
			if(v.getId() == start) return vertices.indexOf(v);
		}
		return -1;
	}

	private Vertex getUnvisitedChildVertex (Vertex v) {
		int index=indexOfId(v.getId());
		int j=0;
		while(j<size) {
			if(adjMatrix[index][j]==1 && ((Vertex)vertices.get(j)).isVisited()==false) {
				return (Vertex)vertices.get(j);
			}
			j++;
		}
		return null;
	}
	
	public void bfs() {
		for (Vertex origin : vertices) {
			Queue<Vertex> q=new LinkedList<Vertex>();
			int[] distance = new int[size+1];
			for (int i = 0; i < distance.length; i++) {
				distance[i] = -1;
			}
			distance[indexOfId(origin.getId())] = 0;
			q.add(origin);
			printNode(origin);
			origin.setVisited(true);
			while(!q.isEmpty()) {
				Vertex n=(Vertex)q.remove();
				Vertex child=null;
				while((child=getUnvisitedChildVertex(n))!=null) {
					child.setVisited(true);
					distance[indexOfId(child.getId())] = distance[indexOfId(n.getId())]+1;
					printNode(child);
					q.add(child);
				}
			}
			closeness(origin, distance);
			clearNodes();
		}
	}
	
	public void closeness(Vertex v, int[] distances) {
		double closeness = 0;
		for (int i = 0; i < distances.length; i++) {
			closeness += Math.pow(2, -distances[i]);
		}
		v.setCloseness(closeness);
	}
	
	private void clearNodes() {
		int i=0;
		while(i<size) {
			Vertex n=(Vertex)vertices.get(i);
			n.setVisited(false);
			i++;
		}
	}
	
	private void printNode(Vertex n) {
		System.out.print(n.getId()+" ");
	}
	
	public int getVertexCount() {
		return vertices.size();
	}
	
	public Vertex getNode(int id) {
		return vertices.get(id);
	}
	
	private void addVertex(Vertex v) {
		if (!containsId(v.getId())) {
			vertices.add(v);
		}
	}
	
	public boolean containsId(int id) {
		for (Vertex vertex : vertices) {
			if (vertex.getId() == id) {
				return true;
			}
		}
		return false;
	}

	public void calculateCloseness() {
		size = vertices.size();
		bfs();
		vertices.sort(new Comparator<Vertex>() {
			@Override
			public int compare(Vertex o1, Vertex o2) {
				if(o1.getCloseness() > o2.getCloseness()) return -1;
				if(o1.getCloseness() < o2.getCloseness()) return 1;
				return 0;
			}
		});
	}

	public List<Vertex> getVertices() {
		return vertices;
	}

	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}
}
