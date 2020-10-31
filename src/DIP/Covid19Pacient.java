package DIP;

import java.util.HashMap;
import java.util.Map;


public class Covid19Pacient extends Pacient {
	public Covid19Pacient(String name, int years) {
		super(name, years);
	}
	Map<Symptom,Integer> symptom_hashmap=new HashMap<Symptom,Integer>();
	
	public void addSymptom(Symptom c,Integer pisua){
		symptom_hashmap.put(c,pisua);
	}
	double calcCovid19Impact(AfectionABSTRACTION afec_abs, IncrementABSTRACTION inc_abs) {
		double afection=0;
		double increment=0;
		double impact;
		//calculate afection
		afection=afec_abs.calculateSympomsAfection(this);
		//calculate increment
		increment=inc_abs.calculateIncrementPerYear(this, afection);
		//calculate impact
		impact=afection+increment;
		return impact;
	}
}