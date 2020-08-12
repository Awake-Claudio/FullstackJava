package com.sirklaude.Earthquake.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Metadata")
public class Metadata {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "generado")
	private float generated;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "titulo")
	private String title;
	
	@Column(name = "estado")
	private float status;
	
	@Column(name = "api")
	private String api;
	
	@Column(name = "cantidad")
	private float count;

// Getter Methods 
	public int getId() {
		return id;
	}

	public float getGenerated() {
		return generated;
	}

	public String getUrl() {
		return url;
	}

	public String getTitle() {
		return title;
	}

	public float getStatus() {
		return status;
	}

	public String getApi() {
		return api;
	}

	public float getCount() {
		return count;
	}

// Setter Methods 

	public void setId(int id) {
		this.id = id;
	}

	public void setGenerated(float generated) {
		this.generated = generated;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setStatus(float status) {
		this.status = status;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public void setCount(float count) {
		this.count = count;
	}
}
