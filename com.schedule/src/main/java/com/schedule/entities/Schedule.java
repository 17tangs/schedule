package com.schedule.entities;

import java.util.List;


public class Schedule {
	
	private String studentName;
	private String userName;
	private List<Subject> subjects;
	
	public Schedule(String m_userName, String m_studentName, List<Subject> m_subjects) {
		this.studentName = m_studentName;
		this.userName = m_userName;
		this.subjects = m_subjects;
	}

	public String getUserName() {
		return this.userName;
	}
	
	public List <Subject> getSubjects() {
		return this.subjects;
	}

	@Override
	public String toString() {
		return "Schedule [userName=" + userName + ", subjects="
				+ subjects + "]";
	}

}
