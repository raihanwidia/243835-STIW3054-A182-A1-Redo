
public class FormulaCaulculate  {

	
	CalculateUseCase a;
	CalculateTechnicalFactors b;
	CalculateExperienceFactors c;
	CalculateActors d;
	
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
	
	
	public double ucp () {
		int uucp = weightedUseCases + weightedActors ;
		double TCF = (0.01 * TechnicalF)+0.6;
		double SzUC = uucp * TCF;
		double ExpFa = (-0.03 * ExperienceF)+1.4;
		double ucp = SzUC * ExpFa;

		
		return ucp;
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
