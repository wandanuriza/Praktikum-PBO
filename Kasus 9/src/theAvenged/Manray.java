package theAvenged;

public class Manray extends SuperHero {

	public Manray(String name, int powerLevel) {
		super(powerLevel, name);
		Power laserEye = new LaserEye();
		Power strength = new Strength();
		addPower(laserEye);
		addPower(strength);
	}
	
	//harus mengimplementasikan abstract method identity dari SuperHero
	@Override
	public void identity() {
		// TODO Auto-generated method stub
		System.out.printf("It's %s, the ManRay! It has the power level of %d\n",this.name,this.powerLevel);
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAME IS " + this.name);
	}
}
