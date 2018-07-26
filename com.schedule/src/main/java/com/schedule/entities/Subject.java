package com.schedule.entities;

public class Subject {
	private String subjectName;
	private String description;
	private String professorName;
	
	public Subject (String p_sn, String p_des, String p_pn) {
		this.subjectName   = p_sn;
		this.description   = p_des;
		this.professorName = p_pn;
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

	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", description="
				+ description + ", professorName=" + professorName + "]";
	}

}
