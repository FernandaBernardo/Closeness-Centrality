package br.com.caelum.vraptor.controller;


public class Vertex {
	private int id;	
	boolean visited;
	private double closeness;
	
	public Vertex(int id) {
		this.setId(id);
		visited = false;
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
}