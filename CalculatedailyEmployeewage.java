package day_3;

public class CalculatedailyEmployeewage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//constants
		int IS_FULL_TIME = 1;
		// computation
		double empcheck = Math.floor(Math.random()* 10) % 2;
		if (empcheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
