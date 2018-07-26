package com.schedule.entities;

public class Assignment {
	private int startingTime;
	private int endingTime;
	private Subject subject;

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
}
