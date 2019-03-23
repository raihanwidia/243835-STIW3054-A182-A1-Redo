
public class CalculateUseCase {
	
	String [] transNnum;
	
	public CalculateUseCase(String [] transNnum) {
		
		this.transNnum = transNnum;
		
	}
	

	
	public int getWeightUseCases() {
     int total = 0;
		
		
		for (int cursor = 0 ; cursor < 3 ; cursor++) {
			
			switch (cursor) {
				case 0:
					total += Integer.parseInt(transNnum [cursor]) * 5;
					break;
				case 1:
					total += Integer.parseInt(transNnum [cursor]) * 10;
					break;
				case 2:
					total += Integer.parseInt(transNnum [cursor]) * 15;
					break;
			}
			
		}
		
		return total;  
		
	}

}
