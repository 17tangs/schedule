package com.schedule.entities;

import java.time.DayOfWeek;


public class AssignedSlot {
	private int startingTime;
	private int endingTime;
	private DayOfWeek day;    // need to make enumeration
	private Subject subject;
	

	public AssignedSlot(int startingTime, int endingTime, DayOfWeek day,
			Subject subject) {
		this.startingTime = startingTime;
		this.endingTime = endingTime;
		this.day = day;
		this.subject = subject;
	}

	public int getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(int startingTime) {
		this.startingTime = startingTime;
	}

	public int getEndingTime() {
		return endingTime;
	}

	public void setEndingTime(int endingTime) {
		this.endingTime = endingTime;
	}

	public Subject getSubject() {
		return subject;
	}

	public DayOfWeek getDay() {
		return day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "AssignedSlot [startingTime=" + startingTime + ", endingTime="
				+ endingTime + ", day=" + day + ", subject=" + subject + "]";
	}
}
