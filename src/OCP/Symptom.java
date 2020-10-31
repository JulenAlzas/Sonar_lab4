package OCP;

abstract class Symptom {
	int covidImpact; 
	int severityIndex;
	int affectedDays ;
	
	abstract Integer getSeverityIndex();
	abstract int getCovidImpact();
	abstract int getAffectedDays();
	
	public void setAffectedDays(int affectedDays) {
		this.affectedDays = affectedDays;
	}
}
