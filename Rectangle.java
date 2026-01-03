package simplePrograms;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		int Area;
		Scanner sc = new Scanner(System.in);
		System.out.println("...Enter The Height...");
		int height = sc.nextInt();
		System.out.println("...Enter The Weidth...");
		int weidth = sc.nextInt();
		Area = height*weidth;
		System.out.println("Area of Rectangle..."+Area);
		sc.close();
	}

}
