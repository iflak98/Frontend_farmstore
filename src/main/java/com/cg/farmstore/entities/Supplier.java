package com.cg.farmstore.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Supplier {

	@Id
	@GeneratedValue
	private int supplierId;
	private String supplierName;
	private UserType userType;
	private long supplierMobile;
	private String supplierLocation;
	@OneToMany(mappedBy = "supplier")
	private List<Orders> orders;
	
	public Supplier() {
		super();
	}

	public Supplier(int supplierId, String supplierName, UserType userType, long supplierMobile,
			String supplierLocation, List<Orders> orders) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.userType = userType;
		this.supplierMobile = supplierMobile;
		this.supplierLocation = supplierLocation;
		this.orders = orders;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public long getSupplierMobile() {
		return supplierMobile;
	}

	public void setSupplierMobile(long supplierMobile) {
		this.supplierMobile = supplierMobile;
	}

	public String getSupplierLocation() {
		return supplierLocation;
	}

	public void setSupplierLocation(String supplierLocation) {
		this.supplierLocation = supplierLocation;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", userType=" + userType
				+ ", supplierMobile=" + supplierMobile + ", supplierLocation=" + supplierLocation + ", orders=" + orders
				+ "]";
	}
	
}
