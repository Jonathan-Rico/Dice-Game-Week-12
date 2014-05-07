public class Main {	
	public static void main(String args []) {		
	
		ThreeDice dice = new ThreeDice();
		System.out.printf("The die has been rolled\nThe dice rolls are\n");

		int D1 = dice.Throw();
		System.out.printf("Die number 1 = %d\n", D1);
		int D2 = dice.Throw();
		System.out.printf("Die number 2 = %d\n", D2);
		int D3 = dice.Throw();
		System.out.printf("Die number 3 = %d\n", D3);
		
		int avg = (D1+D2+D3)/3;
		System.out.printf("The dice rolls have an average value of %d", avg);	
	}
}