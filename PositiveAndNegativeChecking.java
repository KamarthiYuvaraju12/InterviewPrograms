package simplePrograms;
import java.util.*;

public class PositiveAndNegativeChecking {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number...");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("Positive Number...");
		}
		else {
			System.out.println("Negative Number...");
		}
	}

}
