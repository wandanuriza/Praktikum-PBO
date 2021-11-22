package theAvenged;

public class FlyingDutchMan extends SuperHero {
	
	public FlyingDutchMan(String name, int powerLevel) { 
		super(powerLevel, name);
		Power laserEye = new LaserEye();
		Power flying = new Flying();
		addPower(flying);
		addPower(laserEye);
	}
	
	//harus mengimplementasikan abstract method identity dari SuperHero
	@Override
	public void identity() {
		System.out.printf("It's %s, the FlyingDutchMan! It has the power level of %d\n",this.name,this.powerLevel); //bisa akses variabel dari parent
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAME IS " + this.name);
	}
	
}
