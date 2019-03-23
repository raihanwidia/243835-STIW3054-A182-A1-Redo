import java.util.Scanner;

public class InputOutput implements PrintInputOrder {

	CalculateUseCase a;
	CalculateTechnicalFactors b;
	CalculateExperienceFactors c;
	CalculateActors d;
	
	public static Scanner scan  = new Scanner(System.in);


	public InputOutput() {
		
	}
	
	
	
	public void printTf() {
		// TODO Auto-generated method stub
		String [] tf = new String [13];
		for(int x = 0 ; x < 13 ; x++ ) {
			System.out.println(Tf[0][x]);
			String pl = scan.nextLine();
			if (Integer.parseInt(pl) > 5 || Integer.parseInt(pl) < 0) {
				
				System.out.println("   Rate 0 until 5 !");
				x--;
				
			}else{
				
			   Tf[1][x] = pl;
			   tf [x] = Tf[1][x];
			  
			}
		
		
		} 
		
		b = new CalculateTechnicalFactors(tf);
	}

	public void printef() {
		// TODO Auto-generated method stub
		String [] ef = new String [8];
 		for(int x = 0 ; x < 8 ; x++ ) {
 			System.out.println(Ef[0][x]);
 			String pl = scan.nextLine();
			if (Integer.parseInt(pl) > 5 || Integer.parseInt(pl) < 0) {
				
				System.out.println("   Rate 0 until 5 !");
				x--;
				
			}else{
				
				Ef[1][x] = pl;
				ef [x] = Ef[1][x];
			  
			}
 		} 
 		
 	    c = new CalculateExperienceFactors(ef);
	}

	public void printactors() {
		// TODO Auto-generated method stub
		 String [] ac = new String [3];
			for(int x = 0 ; x < 3 ; x++ ) {
				System.out.println(actors[0][x]);
				String pl = scan.nextLine();	
					actors[1][x] = pl;
					ac [x] = actors[1][x];
				  
				}
			
		
		d = new CalculateActors(ac);
	}

	public void printusecases() {
		// TODO Auto-generated method stub
		String [] us = new String [3];
		for(int x = 0 ; x < 3 ; x++ ) {
			System.out.println(usecases[0][x]);
			String pl = scan.nextLine();
				usecases[1][x] = pl;
				us [x] = usecases[1][x];
		}
		
		a = new CalculateUseCase(us);
	}

	public void calculate() {
		// TODO Auto-generated method stub
		FormulaCaulculate p = new FormulaCaulculate(a,b,c,d);
	}

}
