package SRP;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient{
	public Covid19Pacient(String name, int years) {
		super(name, years);
	}
	Map<Symptom,Integer> symptom_hashmap=new HashMap<Symptom,Integer>();

	public void addSymptom(Symptom c,Integer pisua){
		symptom_hashmap.put(c,pisua);
	}
	
	public double sanatedDays() {
		double maximoa = Maximoa_aurkitu();
			return maximoa;
	}

	private double Maximoa_aurkitu() {
		double maximoa=0;
		
		for (Symptom c:symptom_hashmap.keySet()) {
			int afektatutako_egunak=c.getAffectedDays();
			if(afektatutako_egunak>maximoa) {
				maximoa=afektatutako_egunak;
			}
		}
		return maximoa;
	}

	double calcCovid19Impact(Afection afect,Increment inc) {
		if(this.getYears()<10) {
			return 0;
		}

		double afection=afect.AfectionKalkulatu(symptom_hashmap);

		double Increment = inc.getImpact_yearsIncrement(afection, this.getYears());
		
		double impact= afection+Increment;
		return impact;
	}

	

	
}
