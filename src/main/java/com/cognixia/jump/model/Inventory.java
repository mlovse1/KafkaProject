package com.cognixia.jump.model;

import java.io.Serializable;

public class Inventory implements Serializable{

	private static final long serialVersionUID = 1L;
	//id, name of item, unit price, and quanity available
	Integer inventoryId;
	String itemName;
	Double unitPrice;
	Integer quantAvail;
	
	public Inventory() {
		super();
	}

	public Inventory(Integer inventoryId, String itemName, Double unitPrice, Integer quantAvail) {
		super();
		this.inventoryId = inventoryId;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantAvail = quantAvail;
	}

	public Integer getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Integer inventoryId) {
		this.inventoryId = inventoryId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantAvail() {
		return quantAvail;
	}

	public void setQuantAvail(Integer quantAvail) {
		this.quantAvail = quantAvail;
	}

	@Override
	public String toString() {
		return "Inventory [inventoryId=" + inventoryId + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", quantAvail=" + quantAvail + "]";
	}
	
	
	
	

}
