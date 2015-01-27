package br.com.caelum.vraptor.controller;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Vertex {
	private int id;	
	private boolean visited;
	private double closeness;
	
	public Vertex(int id) {
		this.setId(id);
		setVisited(false);
	}
	
	@Override
	public String toString() {
		return String.valueOf(getId());
	}

	public double getCloseness() {
		return closeness;
	}

	public void setCloseness(double closeness) {
		this.closeness = closeness;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}