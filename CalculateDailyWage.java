package CalculateDailywage;

public class CalculateDailyWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int Is_Full_Time = 1;
		int Emp_Rate_Per_Hour = 20;
		//
		int empHrs = 0;
		int empWage = 0;
		//
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == Is_Full_Time)
			empHrs = 8;
		else
			  empHrs = 0;
	      
		empWage = empHrs * Emp_Rate_Per_Hour;
		System.out.println("Emp Wage:" + empWage);
		
	}

}
