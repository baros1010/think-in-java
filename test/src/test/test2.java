package test;

import java.time.LocalDate;

public class test2 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		LocalDate standardFromDay = today.minusMonths(1).withDayOfMonth(1);
		System.out.println(standardFromDay);
		String s1="1017-01-01";
		String s2="2016-01-01";
		System.out.println(s1.compareTo(s2));
	}
}
