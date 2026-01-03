package simplePrograms;

public class SeriesProgram {
	
	public  void serisNumbers() {
		for(int i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		for(int i=4;i>=1;i--) {
			System.out.print(i+" ");
		}
		
	}
	public static void main(String[]args) {
		SeriesProgram s = new SeriesProgram();
		s.serisNumbers();
	}

}
