

public class CalculateTechnicalFactors {

	String [] techFactrNrate	;
	
	public CalculateTechnicalFactors(String [] techFactrNrate) {
		
		this.techFactrNrate = techFactrNrate;
		
		
	}
	
	public double totalTF() {
		
	double total = 0;
				
	for ( int cursor = 0 ; cursor < 13 ; cursor++ ) {

		 switch (cursor) {
	  	
	     	case 0:
	     		total += Double.parseDouble(techFactrNrate[cursor])*2;
	     		break;
	     	case 1:
	     		total += Double.parseDouble(techFactrNrate[cursor])*1;
	     		break;
	     	case 2:
	     		total += Double.parseDouble(techFactrNrate[cursor])*1;
	     		break;
	     	case 3:
	     		total += Double.parseDouble(techFactrNrate[cursor])*1;
	     		break;
	     	case 4:
	     		total += Double.parseDouble(techFactrNrate[cursor])*1;
	     		break;
	     	case 5:
	     		total += Double.parseDouble(techFactrNrate[cursor])*0.5;
	     		break;
	     	case 6:
	     		total += Double.parseDouble(techFactrNrate[cursor])*0.5;
	     		break;
	     	case 7:
	     		total += Double.parseDouble(techFactrNrate[cursor])*2;
	     		break;
	     	case 8:
	     		total += Double.parseDouble(techFactrNrate[cursor])*1;
	     		break;
	     	case 9:
	     		total += Double.parseDouble(techFactrNrate[cursor])*1;
	     		break;
	     	case 10:
	     		total += Double.parseDouble(techFactrNrate[cursor])*1;
	     		break;
	     	case 11:
	     		total += Double.parseDouble(techFactrNrate[cursor])*1;
	     		break;
	     	case 12:
	     		total += Double.parseDouble(techFactrNrate[cursor])*1;
	     		break;
		 }
     }
	
		return total;
				
	}
	
	
	
	
}
