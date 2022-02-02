package com.cg.farmstore.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Orders {

	@Id
	@GeneratedValue
	private int orderId;
	private int quantity;
	private double price;
	private Date date;
	@ManyToMany
	@JoinTable(name = "item_orders",joinColumns = {@JoinColumn(referencedColumnName = "orderId")},inverseJoinColumns = {@JoinColumn(referencedColumnName = "itemId")})
	private List<Item> items;
	@ManyToOne
	private Supplier supplier;
	
	public Orders() {
		super();
	}
	
	public Orders(int orderId, int quantity, double price, Date date, List<Item> items, Supplier supplier) {
		super();
		this.orderId = orderId;
		this.quantity = quantity;
		this.price = price;
		this.date = date;
		this.items = items;
		this.supplier = supplier;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public Supplier getSupplier() {
		return supplier;
	}
	
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", quantity=" + quantity + ", price=" + price + ", date=" + date
				+ ", items=" + items + ", supplier=" + supplier + "]";
	}
	
}
