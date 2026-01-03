package simplePrograms;

import java.util.Scanner;

public class AddandEvenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number...");
		int num = sc.nextInt();
		int rem;
		while(num!= 0) {
			 rem = num%10;
			if(rem%2 == 0) {
				System.out.println("Even Number.."+num);
				break;
			}
			else {
				System.out.println("Add Number.."+num);
				break;
			}
		}
	}

}
