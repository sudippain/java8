package com.feature.StreamApi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class GetSecondFridayNxtMonth {

	public static void main(String[] args) {
		
		LocalDateTime l = LocalDateTime.now();
		System.out.println(l);
		
		l=l.with(TemporalAdjusters.dayOfWeekInMonth(2,DayOfWeek.FRIDAY ));
		System.out.println(l);
	}
}
