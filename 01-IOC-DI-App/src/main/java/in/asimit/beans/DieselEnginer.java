package in.asimit.beans;

public class DieselEnginer implements IEngine {
	
	public DieselEnginer() {
	System.out.println("DieselEnginer :: Constructor");	
	}
	

	public int start() {
		System.out.println("Diesel Engine Started");
		return 1;
	}

}
