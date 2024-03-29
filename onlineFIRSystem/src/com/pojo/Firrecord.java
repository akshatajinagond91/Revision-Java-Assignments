package com.pojo;

// Generated Mar 30, 2018 3:48:21 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Firrecord generated by hbm2java
 */
public class Firrecord implements java.io.Serializable {

	private Integer firNo;
	private Registration registration;
	private String victimName;
	private String victimAddress;
	private String victimCity;
	private String information;
	private Set statuses = new HashSet(0);

	public Firrecord() {
	}

	public Firrecord(Registration registration, String victimName, String victimAddress, String victimCity,
			String information, Set statuses) {
		this.registration = registration;
		this.victimName = victimName;
		this.victimAddress = victimAddress;
		this.victimCity = victimCity;
		this.information = information;
		this.statuses = statuses;
	}

	public Integer getFirNo() {
		return this.firNo;
	}

	public void setFirNo(Integer firNo) {
		this.firNo = firNo;
	}

	public Registration getRegistration() {
		return this.registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	public String getVictimName() {
		return this.victimName;
	}

	public void setVictimName(String victimName) {
		this.victimName = victimName;
	}

	public String getVictimAddress() {
		return this.victimAddress;
	}

	public void setVictimAddress(String victimAddress) {
		this.victimAddress = victimAddress;
	}

	public String getVictimCity() {
		return this.victimCity;
	}

	public void setVictimCity(String victimCity) {
		this.victimCity = victimCity;
	}

	public String getInformation() {
		return this.information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public Set getStatuses() {
		return this.statuses;
	}

	public void setStatuses(Set statuses) {
		this.statuses = statuses;
	}

}
