package com.schedule.entities;

import java.time.DayOfWeek;
import java.time.LocalTime;



public class Slot {
	private LocalTime startTime;
	private LocalTime endTime;
	private String instructor;
	private DayOfWeek day;    // need to make enumeration
	private String location;
	private boolean isMeeting;
	

	public Slot(LocalTime m_startTime, LocalTime m_endTime, DayOfWeek day, String m_instructor, String m_location, boolean m_isMeeting) {
		this.startTime = m_startTime;
		this.endTime = m_endTime;
		this.day = day;
		this.location = m_location;
		this.instructor = m_instructor;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public LocalTime getStartTime() {
		return startTime;
	}
	public int getStartHour() {
		return startTime.getHour();
	}
	public int getStartMinute() {
		return startTime.getMinute();
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public int getEndHour() {
		return endTime.getHour();
	}
	public int getEndMinute() {
		return endTime.getMinute();
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public void setStartTime(int hour, int minute) {
		this.startTime = LocalTime.of(hour, minute);
	}
	public void setEndTime(int hour, int minute) {
		this.endTime = LocalTime.of(hour, minute);
	}

	public DayOfWeek getDay() {
		return day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}
	
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public void setMeeting(boolean isMeeting) {
		this.isMeeting = isMeeting;
	}
	public boolean getMeeting() {
		return isMeeting;
	}

	@Override
	public String toString() {
		return "AssignedSlot [startingTime=" + startTime.toString() + ", endingTime="
				+ endTime.toString() + ", day=" + day + ", instructor=" + instructor + "]";
	}
}
