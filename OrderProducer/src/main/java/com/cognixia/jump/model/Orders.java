package com.cognixia.jump.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Table(name="Orders")
@Entity
public class Orders implements Serializable {

	private static final long serialVersionUID = 1L;
//id, date of purchase, item purchased, quantity of the item purchased
	
	@Id
	@Column(name="OrderId")
	Integer orderId;
	
	@Column(name="DateofPurchase")
	Date dateofPurchase;
	
	@Column(name="ItemName")
	String itemName;
	
	@Column(name="QuantityPurchased")
	Integer quantPurchased;
	
	@Transient
	List<Inventory> inventory;
	
	public Orders() {
		super();
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getDateofPurchase() {
		return dateofPurchase;
	}

	public void setDateofPurchase(Date dateofPurchase) {
		this.dateofPurchase = dateofPurchase;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getQuantPurchased() {
		return quantPurchased;
	}

	public void setQuantPurchased(Integer quantPurchased) {
		this.quantPurchased = quantPurchased;
	}

	public List<Inventory> getInventory() {
		return inventory;
	}

	public void setInventory(List<Inventory> inventory) {
		this.inventory = inventory;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", dateofPurchase=" + dateofPurchase + ", itemName=" + itemName
				+ ", quantPurchased=" + quantPurchased + ", inventory=" + inventory + "]";
	}
	
	
	
}
