
public class CalculateActors {

	String [] qntyNtype;
	
	public CalculateActors(String [] qntyNtype) {
		
		this.qntyNtype = qntyNtype;
		
	}
	
	
	public int getTotalActorPoints() {
		
		int total = 0;
		
		
		for (int cursor = 0 ; cursor < 3 ; cursor++) {
			
			switch (cursor) {
				case 0:
					total += Integer.parseInt(qntyNtype [cursor]) * 1;
					break;
				case 1:
					total += Integer.parseInt(qntyNtype [cursor]) * 2;
					break;
				case 2:
					total += Integer.parseInt(qntyNtype [cursor]) * 3;
					break;
			}
			
		}
		
		return total;  
	}
	
	
}
