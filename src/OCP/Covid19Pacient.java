package OCP;

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

	double calcCovid19Impact() {
		double afection=0;
		double increment=0;
		double impact;

		afection = AfectionKalkulatu(afection);

		if (getYears()>65) increment=afection*0.5;
		impact=afection+increment;
		return impact;
	}

	private double AfectionKalkulatu(double afection) {
		for (Symptom c:symptom_hashmap.keySet())
			afection=afection+c.getSeverityIndex()*symptom_hashmap.get(c);		
		afection=afection/(symptom_hashmap.size());
		return afection;
	}
}
