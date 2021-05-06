package lesson01.homework;

import java.util.Scanner;

public class Season {
	public static void main(String[] args) {
		String month = (new Scanner(System.in).nextLine().toLowerCase());
		System.out.print("If-else realisation! Answer: ");
		ifElseRealisation(month);
		System.out.print("Switch-case realisation! Answer: ");
		switchCaseRealisation(month);
		System.out.print("Enum realisation! Answer: ");
		enumRealisation(month);
	}
	
	public static  void ifElseRealisation(String month){
		if(month.equals("december") || month.equals("january") || month.equals("february")) {
			System.out.println("Winter!");
		}
		else if(month.equals("march") || month.equals("april") || month.equals("may")) {
			System.out.println("Spring!");
		}
		else if(month.equals("june") || month.equals("july") || month.equals("august")) {
			System.out.println("Summer!");
		}
		else if(month.equals("september") || month.equals("october") || month.equals("november")) {
			System.out.println("Fall!");
		}
		else {
			System.out.println("Month doesn't exist!");
		}
	}
	
	
	public static  void switchCaseRealisation(String month){
		switch (month) {
			case "december":
			case "january":
			case "february":
				System.out.println("Winter!");
				break;
			case "march":
			case "april":
			case "may":
				System.out.println("Spring!");
				break;
			case "june":
			case "july":
			case "august":
				System.out.println("Summer!");
				break;
			case "september":
			case "october":
			case "november":
				System.out.println("Fall!");
				break;
			default:
				System.out.println("Month doesn't exist!");
				break;
		}
	}
	
	
	public enum Month {
		JANUARY ("Winter!"),
		FEBRUARY("Winter!"),
		MARCH   ("Spring!"),
		APRIL   ("Spring!"),
		MAY     ("Spring!"),
		JUNE    ("Summer!"),
		JULY    ("Summer!"),
		AUGUST  ("Summer!"),
		SEPTEMBER("Fall!"),
		OCTOBER ("Fall!"),
		NOVEMBER("Fall!"),
		DECEMBER("Winter!");
		
		private final String season;
		
		Month(String season) {
			this.season = season;
		}
		
		public String getSeason() {
			return season;
		}
	}
	
	
	public static void enumRealisation(String month){
		try {
			System.out.println(Month.valueOf(month.toUpperCase()).getSeason());
		} catch(IllegalArgumentException e) {
			System.out.println("Month doesn't exist!");
		}
	}
}