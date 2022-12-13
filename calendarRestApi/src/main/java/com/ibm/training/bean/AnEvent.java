package com.ibm.training.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AnEvent {
	String title;

	String start;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	public AnEvent() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AnEvent(String title, String start) {
		this.title = title;
		this.start = start;
	}

}
