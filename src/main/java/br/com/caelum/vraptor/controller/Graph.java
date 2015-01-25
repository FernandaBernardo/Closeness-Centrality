package br.com.caelum.vraptor.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
	List<Vertex> vertices;
	public int[][] adjMatrix;
	int size;
	
	public Graph() {
		vertices = new ArrayList<Vertex>();
	}
	
	public void connectVertex(int start,int end) {
		if(adjMatrix == null) {
			size=vertices.size();
			adjMatrix=new int[size][size];
		}
		
		int startIndex = indexOfId(start);
		int endIndex = indexOfId(end);
		adjMatrix[startIndex][endIndex]=1;
		adjMatrix[endIndex][startIndex]=1;
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
			if(adjMatrix[index][j]==1 && ((Vertex)vertices.get(j)).visited==false) {
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
			origin.visited=true;
			while(!q.isEmpty()) {
				Vertex n=(Vertex)q.remove();
				Vertex child=null;
				while((child=getUnvisitedChildVertex(n))!=null) {
					child.visited=true;
					distance[child.getId()] = distance[n.getId()]+1;
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
			n.visited=false;
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
	
	public void addVertex(Vertex v) {
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
}
