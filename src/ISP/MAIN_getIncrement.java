package ISP;

public class MAIN_getIncrement {
	public static void main(String[] args) {
		Pertsona p= new Pertsona("Julen_getIncrement", 67);
		Pertsona p1= new Pertsona("Julen_pertsona_Increment", 22);
		
		IncrementABSTRACTION inc = new CalcIncrement();
		int afection=40;
		double p_ren_covid_increment= inc.getIncrementByYear(p, afection);
		double p1ren_covid_increment= inc.getIncrementByYear(p1, afection);
		
		System.out.println(p1.getName()+" persons covid increment is: "+p1ren_covid_increment );
		System.out.println(p.getName()+" persons covid increment is: "+p_ren_covid_increment );
		
	}
}
