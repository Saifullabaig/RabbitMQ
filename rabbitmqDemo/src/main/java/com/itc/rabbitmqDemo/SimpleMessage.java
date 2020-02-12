package com.itc.rabbitmqDemo;

import java.io.Serializable;

public class SimpleMessage implements Serializable{
	
	private String name;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public SimpleMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SimpleMessage [name=" + name + ", description=" + description + "]";
	}
	
	
	
}
