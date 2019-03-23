
public class CalculateExperienceFactors {

	String []experFactNrate;
	int E1E6Counter = 0;

	
	public CalculateExperienceFactors(String [] experFactNrate) {
		
		this.experFactNrate = experFactNrate;
		
	}
	
	public int manhFormula() {
		int t;
		
		if (E1E6Counter == 2 || E1E6Counter < 2) {
			t = 1;
		}else if (E1E6Counter == 3 || E1E6Counter == 4){
			t = 2;
		}else {
			t = 3;
		}
		
		return t;
	}
	

	
	public double totalEF() {
		
		
		double total = 0;
		
		for ( int cursor = 0 ; cursor < 13 ; cursor++ ) {

			 switch (cursor) {
		  	
		     	case 0:
		     		total += Double.parseDouble(experFactNrate[cursor])*1;
		     		if (Double.parseDouble(experFactNrate[cursor])<3){
		     			E1E6Counter++;
		     		}
		     		break;
		     	case 1:
		     		total += Double.parseDouble(experFactNrate[cursor])*0.5;
		     		if (Double.parseDouble(experFactNrate[cursor])<3){
		     			E1E6Counter++;
		     		}
		     		break;
		     	case 2:
		     		total += Double.parseDouble(experFactNrate[cursor])*1;
		     		if (Double.parseDouble(experFactNrate[cursor])<3){
		     			E1E6Counter++;
		     		}
		     		break;
		     	case 3:
		     		total += Double.parseDouble(experFactNrate[cursor])*0.5;
		     		if (Double.parseDouble(experFactNrate[cursor])<3){
		     			E1E6Counter++;
		     		}
		     		break;
		     	case 4:
		     		total += Double.parseDouble(experFactNrate[cursor])*0;
		     		if (Double.parseDouble(experFactNrate[cursor])<3){
		     			E1E6Counter++;
		     		}
		     		break;
		     	case 5:
		     		total += Double.parseDouble(experFactNrate[cursor])*2;
		     		if (Double.parseDouble(experFactNrate[cursor])<3){
		     			E1E6Counter++;
		     		}
		     		break;
		     	case 6:
		     		total += Double.parseDouble(experFactNrate[cursor])*-1;
		     		if (Double.parseDouble(experFactNrate[cursor])>3){
		     			E1E6Counter++;
		     		}
		     		break;
		     	case 7:
		     		total += Double.parseDouble(experFactNrate[cursor])*-1;
		     		if (Double.parseDouble(experFactNrate[cursor])>3){
		     			E1E6Counter++;
		     		}
		     		break;
		   
			 }
	     }
		
		return total;
	}
	
	
}
