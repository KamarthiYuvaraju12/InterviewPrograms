package simplePrograms;
import java.util.Scanner;

public class Swaptwonumbers {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The n1 Number...");
		int n1 = sc.nextInt();
		System.out.println("Enter The n2 Number...");
		int n2 = sc.nextInt();
		System.out.println("Before Swap numbers...");
		System.out.println("...n1 number..."+n1);
		System.out.println("...n2 number..."+n2);
		int n3;
		n3 = n1;
		n1 = n2;
		System.out.println("After Swap numbers...");
		System.out.println("...n1 number..."+n1);
		System.out.println("...n2 number..."+n3);
	sc.close();
	}

}
