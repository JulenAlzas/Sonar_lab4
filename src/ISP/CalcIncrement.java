package ISP;

	public class CalcIncrement extends IncrementABSTRACTION{
		// adin eta afection indize bat emanda, afekzio indizea adinaren arabera inkrementatzen du
		public double getIncrementByYear(yearable p, int afection){
			if (p.getYears()>65) return afection*0.5; else return 0;
		}
	}

