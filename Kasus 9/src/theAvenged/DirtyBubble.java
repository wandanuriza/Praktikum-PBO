package theAvenged;

public class DirtyBubble extends SuperHero {

	public DirtyBubble(String name, int powerLevel) {
		super(powerLevel, name);
		Power flying = new Flying();
		Power strength=new Strength();
		addPower(flying);
		addPower(strength);
	}

	//harus mengimplementasikan abstract method identity dari SuperHero
	@Override
	public void identity() {
		// TODO Auto-generated method stub
		System.out.printf("It's %s, the DirtyBubble! It has the power level of %d\n",this.name,this.powerLevel);
		System.out.println(".....HEED ME.....");
	}
	
}

