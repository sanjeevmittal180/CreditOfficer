package com.rbs.creditofficer.ui.model;

public class AnalyticsResponseModel {

	private String sector;
	private long totalExposure;
	private int noOfFacilities;
	private int noOfCustomers;

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

}
