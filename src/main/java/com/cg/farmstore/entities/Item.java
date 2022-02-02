package com.cg.farmstore.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	@Id
	@GeneratedValue
	private int itemId;
	private String itemName;
	private int itemQuantity;
	private double itemPrice;
	private Category itemCategory;
	@ManyToOne
	private Farmer farmer;
	@ManyToMany(mappedBy = "items")
	private List<Orders> orders;
	private boolean verified;
	
	public Item() {
		super();
	}

	public Item(int itemId, String itemName, int itemQuantity, double itemPrice, Category itemCategory, Farmer farmer,
			List<Orders> orders, boolean verified) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.itemCategory = itemCategory;
		this.farmer = farmer;
		this.orders = orders;
		this.verified = verified;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Category getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(Category itemCategory) {
		this.itemCategory = itemCategory;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemQuantity=" + itemQuantity + ", itemPrice="
				+ itemPrice + ", itemCategory=" + itemCategory + ", farmer=" + farmer + ", orders=" + orders
				+ ", verified=" + verified + "]";
	}

}
