package com.darshan.employeewagecomputation;
import java.util.Random;
public class EmployeeWageComputation {

	public static void main(String[] args) {

		int attendance = 0;
		int dailyWage = 0;
		final int WAGE_PER_HR = 20;
		final int FULL_DAY_HR = 8;
		
		System.out.println("Welcome to Employee Wage Computation Program");
		
		Random random = new Random();
		attendance = random.nextInt(9)%2;
		
		System.out.println( attendance );
		if(attendance == 0)
		{
			System.out.println("Employee is Absent");
		}
		else
		{
			System.out.println("Employee is Present");
		    dailyWage = WAGE_PER_HR * FULL_DAY_HR;
		    System.out.println("Employee Wage :"+dailyWage);
		}
	}

}
