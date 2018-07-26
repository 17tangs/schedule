package com.schedule.entities;

import java.util.List;


public class Schedule {
	
	private String userName;
	private List<AssignedSlot> assignedSlots;
	
	public Schedule(String userName, List<AssignedSlot> assignedSlots) {
		this.userName = userName;
		this.assignedSlots = assignedSlots;
	}

	public String getUserName() {
		return this.userName;
	}
	
	public List <AssignedSlot> getAssignedSlots() {
		return this.assignedSlots;
	}

	@Override
	public String toString() {
		return "Schedule [userName=" + userName + ", assignedSlots="
				+ assignedSlots + "]";
	}

}
