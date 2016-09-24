package lesson03_TypeCasting;

public class LessonThree_TypeCasting {

	public static void main(String[] args) {
		String a = "1", b= "2";
		String c = a + b;
		System.out.println("summan är: ");
		System.out.println(c);
		
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		int k = i +j;
		System.out.println("summan är: ");
		System.out.println(k);
		
		String d = "34.55";
		double ds = Double.parseDouble(d);
		System.out.println(ds-1);
		
		/*
		 * Understanding Type Casting:
		 */

		// 20/ 15 = 1.33333333;
		int x =20, y = 15;
		int z = x/y;	// int / int => int
		double d1 = x/y; // int / int => double
		double d2 = x/(1.0*y); // int / (double *int) => double, Explicit Type Casting
		double d3 = (double) x/y;//double int/ int => double, implicit Type Casting;
		System.out.println(z);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		
		
	}

}
