package simplePrograms;

import java.util.Scanner;

public class LargestNumberAmongThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Num1...");
		int num1 = sc.nextInt();
		System.out.println("Enter The Num2...");
		int num2 = sc.nextInt();
		System.out.println("Enter The Num3...");
		int num3 = sc.nextInt();
		int temp = num1>num2?num1:num2;
		int largest = num3>temp?num3:temp;
		System.out.println(" Among Largest Num..."+largest);
				
	}


}
