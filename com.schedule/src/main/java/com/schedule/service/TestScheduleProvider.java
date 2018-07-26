package com.schedule.service;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.schedule.entities.AssignedSlot;
import com.schedule.entities.Schedule;
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
		// list of subjects provided
		this.subjectDataBase = new HashMap<String, Subject>();
		subjectDataBase.put("videogames", new Subject("Video Game", "Learn to create cool video games. Unity and Blender", "John Gamer")); 
		subjectDataBase.put("math"      , new Subject("Math", "learn mathsy stuff", "John Mather"));
		subjectDataBase.put("french"    , new Subject("French", "Learn french. PS learn to bake bagguete too", "John Frencher"));
		subjectDataBase.put("physics"   , new Subject("Physics", "Learn to blow stuffs", "John Physicer"));
		
	    AssignedSlot as  = new AssignedSlot(2, 4, DayOfWeek.MONDAY, subjectDataBase.get("videogames"));
	    AssignedSlot as1 = new AssignedSlot(10, 12, DayOfWeek.TUESDAY, subjectDataBase.get("french"));
	    
	    List<AssignedSlot> l = new ArrayList<AssignedSlot>();
	    l.add(as);
	    l.add(as1);
	    
	    scheduleDataBase = new HashMap<String, Schedule>();
	    
	    scheduleDataBase.put("Sabin", new Schedule("Sabin", l));
	    scheduleDataBase.put("Sam", new Schedule("Sam", l));
	}
}
