package com.schedule.entities;

import java.util.List;


public class Schedule {
	
	private String userName;
	private List<Assignment> assignments;
	
	public String getUserName() {
		return this.userName;
	}
	
	public List <Assignment> getAssignments() {
		return this.assignments;
	}
}
