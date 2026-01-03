package simplePrograms;

import java.util.Scanner;

public class Valueofchar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Ascii Value...");
		int i = sc.nextInt();
		while(i>0) {
			char ch = (char)i;
			System.out.println(ch);
			break;
		}
		
sc.close();
	}


}
