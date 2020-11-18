package com.rbs.creditofficer.ui.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AnalyticsRequestModel {
	
	@NotNull(message="Sector can not be null")
	@Size(min=2, message= "Sector name must not be less than two characters")
	private String sector;
	
	@Min(value = 0L, message = "Exposure must be positive")
	private long totalExposure;
	
	@Min(value = 0L, message = "Number of Facilities value must be positive")
	private int noOfFacilities;
	
	@Min(value = 0L, message = "Number of customers value must be positive")
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
