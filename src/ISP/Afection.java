package ISP;

import java.util.Map;

public class Afection {
	
	public Afection() {
		
	}
	public double AfectionKalkulatu(Map<Symptom,Integer> symptom_hashmap) {
		double afection=0;

		for (Symptom c:symptom_hashmap.keySet()) {
			if(c.getCovidImpact()>50) {
				afection=afection+c.getSeverityIndex()*symptom_hashmap.get(c);	
			}
		}	
		afection=afection/(symptom_hashmap.size());
		return afection;
	}
}
