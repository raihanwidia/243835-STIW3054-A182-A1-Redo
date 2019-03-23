
public class Effort {
	
	int usecase;
	int actor;
	double TF;
	double EF;
	int formulatype;
	double ucp;
	
	
	public Effort(int usecase , int actor , double TF , double EF , int formulatype) {
		
	this.usecase = usecase;
	this.actor = actor;
	this.TF = TF;
	this.EF = EF;
	this.formulatype = formulatype;
		
		
	}
	
	public int Uucp () {
		return usecase + actor; 
	}
	
	public double Tcf() {
		return (0.01 * TF)+0.06;
	}
	
	public double UCP() {
		
		int uucp = usecase + actor ;
		double TCF = (0.01 * TF)+0.6;
		
		
		
		double SzUC = uucp * TCF;
		double ExpFa = (-0.03 * EF)+1.4;
		
		
		ucp = SzUC * ExpFa;

		
		return ucp;
	}
	
	public double Manhours(){
		
		double effrt;
		
		if (formulatype == 1) {
			effrt = ucp * 20;
		}else if (formulatype == 2) {
			effrt = ucp * 28;
		}else {
			effrt = -1;
		}
		
		return effrt;
	}
	
	
	
	
	
	
	
}
