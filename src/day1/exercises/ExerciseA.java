package day1.exercises;

public class ExerciseA {

	public static void main(String[] args) {

		double salary = 10000;
		
		double[][] TaxCalc = new double [2][2];
		TaxCalc[0][0] = 15000;
		TaxCalc[0][1] = .10;
		TaxCalc[1][0] = 40000;
		TaxCalc[1][1] = .20;
		
		for(int i = 0; i <= 1; i++) {
			//System.out.println(i);
			if(salary < TaxCalc[i][0]) {
				System.out.println("The tax for a salary of " + salary + " is " + salary*TaxCalc[i][1]);
				break;
			}else {
				System.out.println("The tax for a salary of " + salary + " is " + salary*.3);
				break;
			}
		}
		
	}

}
