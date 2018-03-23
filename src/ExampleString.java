
public class ExampleString {

	public static void main(String[] args) {

		String x = "James Dean";
		
		System.out.println("Hello " + x);
		
		System.out.println(x.toUpperCase());
		
		System.out.println(x.substring(2));

		System.out.println(x.substring(2,7));

		System.out.println(x.charAt(3));
		
		String age = "38";
		String salary = "789462.12";
		
		//Wrapper classes
		
		int a = Integer.parseInt(age)/2;
		System.out.println(a);
		
		double s = Double.parseDouble(salary) * .15;
		System.out.println(s);
		
		
		
	}

}
