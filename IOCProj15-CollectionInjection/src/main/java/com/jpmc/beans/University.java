package com.jpmc.beans;

import java.util.Date;
import java.util.Map;

public class University {
	private Map<String, String> facultySubjects;
	private Map<String, Date> meetingDates;
	private Map<?, ?> mapData;

	public void setFacultySubjects(Map<String, String> facultySubjects) {
		this.facultySubjects = facultySubjects;
	}

	public void setMeetingDates(Map<String, Date> meetingDates) {
		this.meetingDates = meetingDates;
	}

	public void setMapData(Map<?, ?> mapData) {
		this.mapData = mapData;
	}

	@Override
	public String toString() {
		return "University [facultySubjects=" + facultySubjects + ", meetingDates=" + meetingDates + ", mapData="
				+ mapData + "]";
	}

}
