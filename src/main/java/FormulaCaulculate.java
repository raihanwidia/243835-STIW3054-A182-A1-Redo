
public class FormulaCaulculate  {

	
	static CalculateUseCase a;
	static CalculateTechnicalFactors b;
	static CalculateExperienceFactors c;
	static CalculateActors d;
	
	int weightedActors;
	int weightedUseCases;
	double ExperienceF;
	double TechnicalF;
	double formulatype;
	
	public FormulaCaulculate(CalculateUseCase a2, CalculateTechnicalFactors b2, CalculateExperienceFactors c2,
			CalculateActors d2) {
		// TODO Auto-generated constructor stub
		this.a = a2;
		this.b = b2;
		this.c = c2;
		this.d = d2;
		
		weightedActors = d.getTotalActorPoints(); 
		weightedUseCases = a.getWeightUseCases();
		TechnicalF = b.totalTF();
		ExperienceF = c.totalEF(); 
	    formulatype = c.manhFormula();
	}

	public int Uucp () {
		return weightedUseCases + weightedActors; 
	}
	
	public double Tcf() {
		return (0.01 * TechnicalF)+0.06;
	}
	
	public double SzUC() {
		int a = Uucp();
		double b = Tcf();
		return a * b;
	}

	public double ExpFa() {
		return (-0.03 * TechnicalF)+1.4;
	}
	
	
	public double ucp () {
		double a = SzUC();
		double b = ExpFa();
		return a*b;
	}
	
    public double Manhours(){
		
		double effrt;
		
		if (formulatype == 1) {
			effrt = ucp () * 20;
		}else if (formulatype == 2) {
			effrt = ucp () * 28;
		}else {
			effrt = -1;
		}
		
		return effrt;
	}
	

	

	
	
	

	
}
