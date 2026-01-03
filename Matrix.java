package simplePrograms;

public class Matrix {
public static void main(String[]args) {
	int a[][] = {{3,4},{4,6}};
	int b[][] = {{4,2},{5,2}};
	int Array[][] = new int[2][2];
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			  Array[i][j] = a[i][j]+b[i][j];
			  System.out.print(Array[i][j]+" ");
		}
		System.out.println();
	}
}
}
