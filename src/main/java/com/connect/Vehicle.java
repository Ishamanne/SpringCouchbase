package com.connect;

import javax.validation.constraints.NotNull;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;


@Document
public class Vehicle {
	@NotNull
	@Id
	private String id;
	@Field
	private String color;
	
	@Field
	private String model;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public Vehicle(String color, String model) {
		this.color = color;
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", model=" + model + "]";
	}
	

}
