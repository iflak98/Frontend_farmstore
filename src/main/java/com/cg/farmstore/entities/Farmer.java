package com.cg.farmstore.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Farmer {

	@Id
	@GeneratedValue
	private int farmerId;
	private String farmerName;
	private UserType userType;
	private long farmerMobile;
	private String farmerLocation;
	@OneToMany(mappedBy = "farmer")
	private List<Item> items;
	
	public Farmer() {
		super();
	}

	public Farmer(int farmerId, String farmerName, UserType userType, long farmerMobile, String farmerLocation,
			List<Item> items) {
		super();
		this.farmerId = farmerId;
		this.farmerName = farmerName;
		this.userType = userType;
		this.farmerMobile = farmerMobile;
		this.farmerLocation = farmerLocation;
		this.items = items;
	}

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public long getFarmerMobile() {
		return farmerMobile;
	}

	public void setFarmerMobile(long farmerMobile) {
		this.farmerMobile = farmerMobile;
	}

	public String getFarmerLocation() {
		return farmerLocation;
	}

	public void setFarmerLocation(String farmerLocation) {
		this.farmerLocation = farmerLocation;
	}
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Farmer [farmerId=" + farmerId + ", farmerName=" + farmerName + ", userType=" + userType
				+ ", farmerMobile=" + farmerMobile + ", farmerLocation=" + farmerLocation + ", items=" + items + "]";
	}	
		
}
