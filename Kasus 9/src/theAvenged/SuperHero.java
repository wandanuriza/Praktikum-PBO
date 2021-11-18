package theAvenged;

public abstract class SuperHero {
	private int powerLevel;
	private String name;
	protected Power[] powerList;
	
	abstract void identity(); //abstract method
	
	public int getPowerLevel() {
		return powerLevel;
	}
	
	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addPower (Power power) {
		powerList.add(power);
	}
	
	public void showPowers() {
		System.out.println("\nIt's" + name);
	}
		
}
