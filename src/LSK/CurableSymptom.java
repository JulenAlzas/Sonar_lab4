package LSK;

public class CurableSymptom extends Symptom implements curable{
	
	public void cure(){
		System.out.println("treatment applied to: "+name);
	}
}
