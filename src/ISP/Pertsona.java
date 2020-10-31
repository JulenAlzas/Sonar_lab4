package ISP;

public class Pertsona implements yearable{
	String name;
	int adina;
	public Pertsona(String name, int adina) {
		super();
		this.name = name;
		this.adina = adina;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYears() {
		return adina;
	}
	public void setAdina(int adina) {
		this.adina = adina;
	}


}
