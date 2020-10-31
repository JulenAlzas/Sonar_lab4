package ISP;

import java.util.Map;

public class CalcAfection extends AfectionABSTRACTION {

	public double calculateSympomsAfection(Covid19Pacient covid19Pacient) {
		double afection=0;
		Map<Symptom,Integer> hashmap=covid19Pacient.symptom_hashmap;
		for (Symptom c:hashmap.keySet()) {
			if(c.getCovidImpact()>50) {
				afection=afection+c.getSeverityIndex()*hashmap.get(c);	
			}
		}	
		afection=afection/(hashmap.size());
		return afection;
	}

}
