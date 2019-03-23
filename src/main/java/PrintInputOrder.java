
public interface PrintInputOrder {

	//initialized  rating of technical factors
		final  static String [][] Tf = { {"\nT1 Must have distributed solution" , "T2 Must respond to specific performance objectives" ,
		                 	"T3 Must meet end-user efficiency desires" ,"T4 Complex internal processing", 
		                 	"T5 Code must reusable", "T6 Must be easy to install","T7 Must be easy to use",
			                "T8 Must be portable","T9 Must be easy to change","T10 Must allow concurent users",
			                "T11 Includes special security features",
			                "T12 Must provide direct access for 3rd parties",
			                "T13 Requires special user training facilities"}
		                    ,{null,null,null,null,null,null,null,null,null,null,null,null,null }};
		//initialized rating for Experience factors 
		final static String [][] Ef = {{"For factors E1-E4, 0 means no experience in the subject, 3 means average, and 5 means expert \r\n E1 Familiar with FPT software process","E2 Application experience"
			                ,"E3 Paradigm experience (OO)","E4 Lead analyst capability",
			                 " For E5, 0 means no motivation on the project, 3 means average, and 5 means high motivation \r\n E5 Motivation"," For E6, 0 means unchanging requirements, 3 means average amount of change expected, and 5 means extremely unstable requirements \r\n E6 Stable Requirements",
			                " For E7, 0 means no part-time technical staff, 3 means on average half of the team is part-time, and 5 means all of the team is part-time \r\n E7 Part-time workers",
			                " For E8, 0 means an easy to use programming language is planned, 3 means the language is average difficulty, and 5 means a very difficult language is planned for the project.  \r\n E8 Difficulty of programming language"}
		                    ,{null,null,null,null,null,null,null,null }};
		//initialized qnty of actors  
		final static String [][] actors = {{"\n Quantity of simple actor represents another system with a defined Application Programming Interface (API).", " Quantity of An average actor is either another system that interacts through a protocol such as TCP/IP " , " Quantity of A complex actor is a person interacting through a\r\n" + 
						"graphical user interface (GUI)."},{null , null , null}};
		
		//initialized qnty of usecase   
		final static String [][] usecases = {{"\nQuantity of simple use case has 3 or fewer transactions" , "Quantity of an average use case has 4 to 7 transactions" , "Quantity of complex use case has more than 7 transactions."},{null , null , null}};
	
    void printTf();
	void printef();
	void printactors();
	void printusecases();
	void calculate();
		
	
}
