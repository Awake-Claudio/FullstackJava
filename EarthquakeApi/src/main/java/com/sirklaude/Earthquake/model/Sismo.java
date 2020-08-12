package com.sirklaude.Earthquake.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sismo")
public class Sismo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long idSismo;
	
	@Column(name = "fecha_inicial")
	private Date starttime;
	
	@Column(name = "fecha_final")
	private Date endtime;
	
	@Column(name = "magnitud_inicial")
	private double minMagnitude;
	
	@Column(name = "magnitud_final")
	private double maxMagnitude;

	public Sismo() {

	}



	public Sismo(long idSismo, Date starttime, Date endtime, double minMagnitude, double maxMagnitude) {
		super();
		this.idSismo = idSismo;
		this.starttime = starttime;
		this.endtime = endtime;
		this.minMagnitude = minMagnitude;
		this.maxMagnitude = maxMagnitude;
	}



	public long getIdSismo() {
		return idSismo;
	}



	public void setIdSismo(long idSismo) {
		this.idSismo = idSismo;
	}



	public Date getStarttime() {
		return starttime;
	}



	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}



	public Date getEndtime() {
		return endtime;
	}



	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}



	public double getMinMagnitude() {
		return minMagnitude;
	}



	public void setMinMagnitude(double minMagnitude) {
		this.minMagnitude = minMagnitude;
	}



	public double getMaxMagnitude() {
		return maxMagnitude;
	}



	public void setMaxMagnitude(double maxMagnitude) {
		this.maxMagnitude = maxMagnitude;
	}



	
		
}
