
public class ExampleArrays {

	public static void main(String[] args) {

/*		int a = 10;
		int b = 20;
		int c, d, e;
		c = 30; d = 40; e = 50;*/
		
		int[] a = {10, 20, 30, 40, 50};
		System.out.println(a[2] + " " + a[4]);
		
		System.out.println("---------------------");
		
		// enhanced for
		for(int temp : a) {
			System.out.println(temp);
		}
		System.out.println("---------------------");
		int[] x = new int[5];
		
		x[3] = 25;
		x[1] = 12;

		for(int temp2 : x) {
			System.out.println(temp2);
		}		
		
		System.out.println("---------------------");
		
		String[] b = new String[5];
		b[1] = "one";
		b[3] = "two";
		
		for(String temp3 : b) {
			System.out.println(temp3);
		}		
		
	}

}
