package com.rbs.creditofficer.shared;

import java.io.Serializable;

public class AnalyticsDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String sector;
	private long totalExposure;
	private int noOfFacilities;
	private int noOfCustomers;
	private String category;
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
