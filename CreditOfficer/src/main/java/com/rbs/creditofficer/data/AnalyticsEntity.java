package com.rbs.creditofficer.data;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="analytics")
public class AnalyticsEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false, length=50)
	private String sector;
	
	@Column(nullable=false)
	private long totalExposure;
	
	@Column(nullable=false)
	private int noOfFacilities;
	
	@Column(nullable=false)
	private int noOfCustomers;
	
	@Column(nullable=false)	
	private String category;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public long getTotalExposure() {
		return totalExposure;
	}

	public void setTotalExposure(long totalExposure) {
		this.totalExposure = totalExposure;
	}

	public int getNoOfFacilities() {
		return noOfFacilities;
	}

	public void setNoOfFacilities(int noOfFacilities) {
		this.noOfFacilities = noOfFacilities;
	}

	public int getNoOfCustomers() {
		return noOfCustomers;
	}

	public void setNoOfCustomers(int noOfCustomers) {
		this.noOfCustomers = noOfCustomers;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
	
	
	
	
	
	

}
