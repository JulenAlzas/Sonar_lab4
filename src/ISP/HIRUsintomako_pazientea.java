package ISP;

public class HIRUsintomako_pazientea {

	public static void main(String[] args) {
		Covid19Pacient hiru_sintomako_pazientea= new Covid19Pacient("Julen_HiruSintoma", 21);
		
		int cardioImpact = 50; int cardioIndex=1; int cardioAffecteddays=3;
		CardioVascularSymptom cardiovascular= new CardioVascularSymptom(cardioImpact,cardioIndex,cardioAffecteddays);
		
		int neuroImpact = 30; int neuroIndex=2; int neuroAffecteddays=3;
		NeuroMuscularSymptom neuromuscular= new NeuroMuscularSymptom(neuroImpact, neuroIndex,neuroAffecteddays);
		
		int respirImpact = 70; int respirIndex=3; int respirAffecteddays=3;
		RespiratorySymptom respiratory = new RespiratorySymptom(respirImpact,respirIndex,respirAffecteddays);
		
		hiru_sintomako_pazientea.addSymptom(cardiovascular,90);
		hiru_sintomako_pazientea.addSymptom(neuromuscular,90 );
		hiru_sintomako_pazientea.addSymptom(respiratory,90 );
		
		AfectionABSTRACTION afec= new CalcAfection();
		IncrementABSTRACTION inc= new CalcIncrement();
		
		double covid_impact=hiru_sintomako_pazientea.calcCovid19Impact(afec, inc);
		System.out.println("The covid impact of "+hiru_sintomako_pazientea.getName() +" is: "+covid_impact);
	
	}

}
