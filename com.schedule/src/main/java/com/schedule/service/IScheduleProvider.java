package com.schedule.service;

import com.schedule.entities.Schedule;

public interface IScheduleProvider {
	public Schedule getScheduleOfUser (String userName);
}
