package SRP;

public class Increment {

	public Increment() {

	}
	public double getImpact_yearsIncrement(double afection, int pacientYears/*Yearable */) {
		double increment=0;
		
		if (pacientYears>65) {
			increment=afection*0.5;
		}else if(pacientYears>45 && pacientYears<65) {
			increment=afection*0.3;
		}
		
		return increment;
	}
}
