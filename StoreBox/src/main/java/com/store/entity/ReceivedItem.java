package com.store.entity;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "store_Item")
public class ReceivedItem
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;

	String item_name;
	int item_number;
    String vendors_name;
    String audit_required;
    public String getItemName() {
  		return item_name;
  	}
  	public void setItemName(String itemName) {
  		this.item_name = itemName;
  	}
    public String getRequired() {
    	
		return audit_required;
	}
	public void setRequired(String auditRequired) {
		this.audit_required = auditRequired;
	}
	
	public int getItemNumber() {
		return item_number;
	}
	public void setItemNumber(int itemNumber) {
		this.item_number = itemNumber;
	}
	public String getVendorsName() {
		return vendors_name; 
	}
	public void setVendorsName(String vendorsName) {
		this.vendors_name = vendorsName;
	}
    @Override
	public String toString() {
		return "ReceivedItem [id=" + id + ", item_name=" + item_name + ", item_number=" + item_number
				+ ", vendors_name=" + vendors_name + ", audit_required=" + audit_required + "]";
	}

}
