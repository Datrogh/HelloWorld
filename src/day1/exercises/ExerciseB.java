package day1.exercises;

public class ExerciseB {

	public static void main(String[] args) {

		String[] nums = {"10", "20", "30", "40"};
		
		int total = 0;
		
//		for(int i = 0; i <= 3; i++) {
//			total =	total + Integer.parseInt(nums[i]);
//		}
		
		for(String temp : nums) {
			total += Integer.parseInt(temp);
		}
		
		System.out.println(total);
	}

}
