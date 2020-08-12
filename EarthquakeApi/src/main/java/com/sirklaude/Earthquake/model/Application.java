package com.sirklaude.Earthquake.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Application")
public class Application {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "tipo")
	private String type;
	@ManyToOne
	@JoinColumn(name = "id_meta")
	Metadata MetadataObject;
	ArrayList<Object> features = new ArrayList<Object>();
	ArrayList<Object> bbox = new ArrayList<Object>();

	// Getter Methods

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public Metadata getMetadata() {
		return MetadataObject;
	}

	// Setter Methods
	public void setId(int id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setMetadata(Metadata metadataObject) {
		this.MetadataObject = metadataObject;
	}
}
