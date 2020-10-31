package LSK;

public class _1_Pacient_LSK_Proba {
	public static void main(String[] args) {
		Covid19Pacient pazientea= new Covid19Pacient("Julen_HiruSintoma", 21);
		
		int cardioImpact = 2; int cardioIndex=1;
		CardioVascularSymptom cardiovascular= new CardioVascularSymptom("Cardioname", cardioImpact,cardioIndex);
		
		int neuroImpact = 3; int neuroIndex=2;
		NeuroMuscularSymptom neuromuscular= new NeuroMuscularSymptom("Neuroname",neuroImpact, neuroIndex);
		
		int respirImpact = 1; int respirIndex=1;
		RespiratorySymptom respiratory = new RespiratorySymptom("respirname", respirImpact,respirIndex);
		
		int incurImpact = 3; int incurIndex=3;
		IncurableSymptom incurable= new IncurableSymptom("incurname",incurImpact, incurIndex);

		pazientea.addSymptom(cardiovascular,70);
		pazientea.addSymptom(neuromuscular,80 );
		pazientea.addSymptom(respiratory,60 );
		pazientea.addSymptom(incurable,90 );
		
		pazientea.showSymptoms();
		pazientea.cure();
	}
}
