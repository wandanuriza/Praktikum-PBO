package theAvenged;
import java.util.*; //import all packages

public abstract class SuperHero implements Comparable<SuperHero> {    
	// abstract class implements Comparable Interface so we can use the sort method
	
	protected int powerLevel;   //protected in order to subclass have access
	protected String name;
	protected java.util.List<Power> powerList;
	
	public SuperHero(int powerLevel, String name) {
		this.powerLevel = powerLevel;
		this.name = name;
		this.powerList = new ArrayList<Power>();
	}
	
	public abstract void identity(); 
	
	public int compareTo(SuperHero superHero) {
		return this.powerLevel - superHero.getPowerLevel(); //compare list
	}
	
	public int getPowerLevel() {
		return powerLevel;
	}
	
	public String getName() {
		return name;
	}
	
	public void addPower (Power power) {
		powerList.add(power);
	}
	
	public void showPowers() {
		System.out.println("TIME TO SHOW YOU MY POWERS");
	    for (Power powerlist : powerList) { 
	    	powerlist.doPower(); 
	    }
	}
		
}
