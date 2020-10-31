package DIP;

public class RespiratorySymptom extends Symptom { 
		
	public RespiratorySymptom(int covidImpact, int severityIndex, int affecteddaysIndex) {
		super();
		this.covidImpact=covidImpact;
		this.severityIndex=severityIndex;
		this.affectedDays=affecteddaysIndex;
	}
	
	public Integer getSeverityIndex() {
		return this.severityIndex;
	}
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}

	public int getAffectedDays() {
		return this.affectedDays;
	}
	public void setAffectedDays(int affecteddaysIndex) {
		this.affectedDays= affecteddaysIndex;
	}
	
}
