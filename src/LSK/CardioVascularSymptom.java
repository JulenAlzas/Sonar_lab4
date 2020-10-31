package LSK;

public class CardioVascularSymptom extends CurableSymptom{ 

	public CardioVascularSymptom(String name, int covidImpact, int severityIndex) {
		super();
		this.name=name;
		this.covidImpact=covidImpact;
		this.severityIndex=severityIndex;
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
}
