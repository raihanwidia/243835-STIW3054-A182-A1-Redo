
public class FormulaCaulculate implements UUCP , EXPFA , SZUC , TCF  {

	
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
	

	
}
