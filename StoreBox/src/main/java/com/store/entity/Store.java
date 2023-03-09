package com.store.entity;

public class Store 
{
	long storeNumber;
	String storeLocation;
	String [] vendors;
	public long getStoreNumber() {
		return storeNumber;
	}
	public void setStoreNumber(long storeNumber) {
		this.storeNumber = storeNumber;
	}
	public String getStoreLocation() {
		return storeLocation;
	}
	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}
	public String[] getVendors() {
		return vendors;
	}
	public void setVendors(String[] vendors) {
		this.vendors = vendors;
	}


}
