package DIP;

public class CalcIncrement extends IncrementABSTRACTION {

	public double calculateIncrementPerYear(Covid19Pacient covid19Pacient, double afection) {
		double increment=0;
		double pacientYears=covid19Pacient.getYears();
		if (pacientYears>65) {
			increment=afection*0.5;
		}else if(pacientYears>45 && pacientYears<65) {
			increment=afection*0.3;
		}

		return increment;
	}


}
