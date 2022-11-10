package j04_AritmeticOPerators.tasks;

public class Task02 {
	public static void main(String[] args) {
		/*
		 Write a program that prints multiplication table for 1.
		 Do not use any loop.
		    1x1=1
		    1x2=2
			1x3=3
			1x4=4
			1x5=5
			1x6=6
			1x7=7	
			1x8=8
			1x9=9
			1x10=10
		 */
		int a =1;
		System.out.println(1+"x" +a +" = " +a++ );
		System.out.println(1+"x" +a +" = " +a++ );
		System.out.println(1+"x" +a +" = " +a++ );
		System.out.println(1+"x" +a +" = " +a++ );
		System.out.println(1+"x" +a +" = " +a++ );
		System.out.println(1+"x" +a +" = " +a++ );
		System.out.println(1+"x" +a +" = " +a++ );
		System.out.println(1+"x" +a +" = " +a++ );
		System.out.println(1+"x" +a +" = " +a++ );
		System.out.println(1+"x" +a +" = " +a++ );

		System.out.println();

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
			System.out.println();
		}

	}
}
