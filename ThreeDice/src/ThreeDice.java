public class ThreeDice {	
	public int Throw() {	
		int total = 0;
		for (int k = 1; k <2; k++){
			int die = (int) (1 + (Math.random() * 6));
			total = total + die;
		}
		return total;
	}
}