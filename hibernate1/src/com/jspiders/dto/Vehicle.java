package com.jspiders.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id
	private int veicleId;
	private String vehicleName;
	
	@ManyToOne
	private userDetails128 userDetails;
	public userDetails128 getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(userDetails128 userDetails) {
		this.userDetails = userDetails;
	}
	public int getVeicleId() {
		return veicleId;
	}
	public void setVeicleId(int veicleId) {
		this.veicleId = veicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

}
