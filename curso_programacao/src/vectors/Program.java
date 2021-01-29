package vectors;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] ages = new double[n];
		
		for (int i = 0; i < n; i++) {
			ages[i] = sc.nextDouble();
		}
		
		System.out.println("===============================================");
		
		for (double age: ages) { // Esse é o for each do java. 
			System.out.println( String.format("%.2f", age) );
		}
		
		
		
		sc.close();
	}

}
