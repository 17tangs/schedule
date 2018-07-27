package com.schedule.entities;

import java.util.List;

public class Subject {
	private String subjectName;
	private String description;
	private String professorName;
	private List<Slot> lectures;
	private List<Slot> discussions;
	private List<Slot> officeHours;
	
	
	public Subject (String m_subjectName, String m_description, String m_professorName, List<Slot> m_lecture, List<Slot> m_discussion, List<Slot> m_officeHours) {
		this.subjectName   = m_subjectName;
		this.description   = m_description;
		this.professorName = m_professorName;
		this.lectures 	   = m_lecture;
		this.discussions   = m_discussion;
		this.officeHours   = m_officeHours;
	}
	
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Slot> getLectures(){
		return lectures;
	}
	public void setLectures(List<Slot> lectures) {
		this.lectures = lectures;
	}
	public List<Slot> getDiscussions() {
		return discussions;
	}
	public void setDiscussions(List<Slot> discussions) {
		this.discussions = discussions;
	}
	public List<Slot> getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(List<Slot> officeHours) {
		this.officeHours = officeHours;
	}
	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", description="
				+ description + ", professorName=" + professorName + "]";
	}

}
