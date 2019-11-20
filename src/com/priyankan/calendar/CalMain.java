package com.priyankan.calendar;

public class CalMain {

	public static void main(String[] args) {
		CalendarDemo cal = new CalendarDemo();
		cal.monthName(Month.December);
		cal.monthName(Month.January);
		cal.directionName(Direction.East);
		cal.directionName(Direction.South);
		cal.directionName(Direction.SouthWest);
		cal.dayName(Day.Sunday);
		cal.dayName(Day.Thursday);
		
	}

}
