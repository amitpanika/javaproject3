package day_3;

public class CalculatedaqilyEmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR =20;
		//variable
		int empHrs = 0;
		int empWage = 0;
		// computation
		double empCheck = Math.floor(Math.random()* 10) % 2;
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp:" + empWage);
	}

}
