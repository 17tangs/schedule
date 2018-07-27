package com.schedule.service;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.schedule.entities.Schedule;
import com.schedule.entities.Slot;
import com.schedule.entities.Subject;

public class TestScheduleProvider implements IScheduleProvider {
	
	// base database
	public Map<String, Schedule> scheduleDataBase;
	

	// list of subjects we currently have
	public Map<String, Subject> subjectDataBase;
	
	public TestScheduleProvider()
	{
		loadTestData();
	}

	public Schedule getScheduleOfUser(String userName) {
		return scheduleDataBase.get (userName);
	}
	
	private void loadTestData()
	{
		//--------------SAM SCHEDULE DATA -----------------------
		
		//Class 1: MATH 131AH
		List<Slot> c1Lec = new ArrayList<Slot>();
		String c1Prof = "Visan M.";
		String c1LecLoc = "MS 5138";
		c1Lec.add(new Slot(LocalTime.of(11, 0), LocalTime.of(12,0), DayOfWeek.MONDAY, c1Prof, c1LecLoc, true));
		c1Lec.add(new Slot(LocalTime.of(11, 0), LocalTime.of(12,0), DayOfWeek.WEDNESDAY, c1Prof, c1LecLoc, true));
		c1Lec.add(new Slot(LocalTime.of(11, 0), LocalTime.of(12,0), DayOfWeek.FRIDAY, c1Prof, c1LecLoc, true));
		
		List<Slot> c1Dis = new ArrayList<Slot>();
		String c1TA = "TA";
		String c1DisLoc = "MS 6627";
		c1Dis.add(new Slot(LocalTime.of(11, 0), LocalTime.of(12, 0), DayOfWeek.TUESDAY, c1TA, c1DisLoc, true));
		
		List<Slot> c1OH = new ArrayList<Slot>();
		
		Subject c1 = new Subject("Math 131AH", "Analysis(Honors)", c1Prof, c1Lec, c1Dis, c1OH);
		

		
		//Class 2: CS 35L
		List<Slot> c2Lec = new ArrayList<Slot>();
		String c2Prof = "Eggert, P.R.";
		String c2LecLoc = "Boelter 3760";
		c2Lec.add(new Slot(LocalTime.of(12, 0), LocalTime.of(2,0), DayOfWeek.MONDAY, c2Prof, c2LecLoc, true));
		c2Lec.add(new Slot(LocalTime.of(12, 0), LocalTime.of(2,0), DayOfWeek.WEDNESDAY, c2Prof, c2LecLoc, true));
		
		List<Slot> c2Dis = new ArrayList<Slot>();
		
		List<Slot> c2OH = new ArrayList<Slot>();
		
		Subject c2 = new Subject("CS 35L", "Software Construction Laboratory", c2Prof, c2Lec, c2Dis, c2OH);
		

		
		//Class 3: CS M51A
		List<Slot> c3Lec = new ArrayList<Slot>();
		String c3Prof = "Ercegovac, M.D.";
		String c3LecLoc = "Bunche 2209A";
		c1Lec.add(new Slot(LocalTime.of(8, 0), LocalTime.of(10,0), DayOfWeek.TUESDAY, c3Prof, c3LecLoc, true));
		c1Lec.add(new Slot(LocalTime.of(8, 0), LocalTime.of(10,0), DayOfWeek.THURSDAY, c3Prof, c3LecLoc, true));
		
		List<Slot> c3Dis = new ArrayList<Slot>();
		String c3TA = "TA";
		String c3DisLoc = "Boelter 5264";
		c3Dis.add(new Slot(LocalTime.of(12, 0), LocalTime.of(2, 0), DayOfWeek.FRIDAY, c3TA, c3DisLoc, true));
		
		List<Slot> c3OH = new ArrayList<Slot>();
		
		Subject c3 = new Subject("CS M51A", "Logic Design of Digital Systems", c3Prof, c3Lec, c3Dis, c3OH);	
		
		
		
		//Class 4: CS180
		List<Slot> c4Lec = new ArrayList<Slot>();
		String c4Prof = "Sarrafzadeh, M.";
		String c4LecLoc = "Engineering VI Mong Learning Center";
		c1Lec.add(new Slot(LocalTime.of(10, 0), LocalTime.of(12,0), DayOfWeek.TUESDAY, c4Prof, c4LecLoc, true));
		c1Lec.add(new Slot(LocalTime.of(10, 0), LocalTime.of(12,0), DayOfWeek.THURSDAY, c4Prof, c4LecLoc, true));
		
		List<Slot> c4Dis = new ArrayList<Slot>();
		String c4TA = "TA";
		String c4DisLoc = "MS 5128";
		c3Dis.add(new Slot(LocalTime.of(4, 0), LocalTime.of(6, 0), DayOfWeek.FRIDAY, c4TA, c4DisLoc, true));
		
		List<Slot> c4OH = new ArrayList<Slot>();
		
		Subject c4 = new Subject("CS 180", "Introduction to Algorithms and Complexity", c4Prof, c4Lec, c4Dis, c4OH);	
		

		
		//Class 5: PHYSICS 4AL
		List<Slot> c5Lec = new ArrayList<Slot>();
		String c5Prof = "Hamilton, P.";
		String c5LecLoc = "Knudsen 1238";
		c5Lec.add(new Slot(LocalTime.of(12, 0), LocalTime.of(3,0), DayOfWeek.TUESDAY, c5Prof, c5LecLoc, true));
		
		List<Slot> c5Dis = new ArrayList<Slot>();
		
		List<Slot> c5OH = new ArrayList<Slot>();
		
		Subject c5 = new Subject("PHYSICS 4AL", "Physics Laboratory for Scientists and Engineers: Mechanics", c5Prof, c5Lec, c5Dis, c5OH);	
		
		

		//Schedule Object
		List<Subject> subjects = new ArrayList<Subject>();
		subjects.add(c1);
		subjects.add(c2);
		subjects.add(c3);
		subjects.add(c4);
		subjects.add(c5);
		
		Schedule samSchedule = new Schedule("sam", "Sam Tang", subjects);
		
		
		
		
		//-------------------SABIN SCHEDULE DATA-----------------------
		List<Subject> subjects2 = new ArrayList<Subject>();
		Schedule sabinSchedule = new Schedule("sabin", "Sabin Gurung", subjects2);
		
	   
		
		
		
		
		//--------------------SCHEDULE DATA BASE----------------------
	    scheduleDataBase = new HashMap<String, Schedule>();
	    scheduleDataBase.put("Sabin", sabinSchedule);
	    scheduleDataBase.put("Sam", samSchedule);
	}
}
