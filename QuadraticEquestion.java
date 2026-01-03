package simplePrograms;

import java.util.*;

public class QuadraticEquestion {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The A value:");
		int a = sc.nextInt();
		System.out.println("Enter The B value:");
		int b = sc.nextInt();
		System.out.println("Enter The C value:");
		 int c = sc.nextInt();
		 double d = ((b*b)-(4*a*c));
		if(d>0){
			  double r1 = (-b+Math.pow(d,0.5))/(2*a);
			  double r2 = (+b+Math.pow(d,0.5))/(2*a);
			  

			  System.out.println("Root is:"+r1);
			 System.out.println("Root is:"+r2);
			  
	}else if(d == 0){
			       double r1 = -b/(2*a);
			       double r2 = +b/(2*a);
			
			       System.out.println("The root is"+r1);
			       System.out.println("The root is"+r2);
			
		}else {
			System.out.println("Roots are Real");
		}
		}
	}


