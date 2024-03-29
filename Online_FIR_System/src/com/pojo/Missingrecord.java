package com.pojo;

// Generated Mar 30, 2018 3:48:21 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Missingrecord generated by hbm2java
 */
public class Missingrecord implements java.io.Serializable {

	private Integer missingNo;
	private Registration registration;
	private String missingthing;
	private String missingthingaddress;
	private String missingthingcity;
	private String information;
	private Set statuses = new HashSet(0);

	public Missingrecord() {
	}

	public Missingrecord(Registration registration, String missingthing, String missingthingaddress,
			String missingthingcity, String information, Set statuses) {
		this.registration = registration;
		this.missingthing = missingthing;
		this.missingthingaddress = missingthingaddress;
		this.missingthingcity = missingthingcity;
		this.information = information;
		this.statuses = statuses;
	}

	public Integer getMissingNo() {
		return this.missingNo;
	}

	public void setMissingNo(Integer missingNo) {
		this.missingNo = missingNo;
	}

	public Registration getRegistration() {
		return this.registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	public String getMissingthing() {
		return this.missingthing;
	}

	public void setMissingthing(String missingthing) {
		this.missingthing = missingthing;
	}

	public String getMissingthingaddress() {
		return this.missingthingaddress;
	}

	public void setMissingthingaddress(String missingthingaddress) {
		this.missingthingaddress = missingthingaddress;
	}

	public String getMissingthingcity() {
		return this.missingthingcity;
	}

	public void setMissingthingcity(String missingthingcity) {
		this.missingthingcity = missingthingcity;
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
