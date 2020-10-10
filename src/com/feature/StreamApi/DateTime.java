package com.feature.StreamApi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime  {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(1996, Month.MARCH, 25);
		System.out.println(d2);
			
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);
		
		LocalTime t2 = LocalTime.of(19, 17, 25, 966);
		System.out.println(t2);
		
		/*
		 * for(String zone :ZoneId.getAvailableZoneIds()) System.out.println(zone);
		 */
		
		 LocalTime timezone = LocalTime.now(ZoneId.of("Asia/Aden"));
		 System.out.println(timezone);
	}
}
