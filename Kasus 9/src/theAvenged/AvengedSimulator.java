package theAvenged;
import java.util.*; //import all packages

public class AvengedSimulator {

	public static void main(String[] args) {
		java.util.List<SuperHero> superHero = new ArrayList<SuperHero>();  //collection pada java
		SuperHero SH1 = new Manray("Gennichiro", 0);
		SuperHero SH2 = new FlyingDutchMan("Shirai", 255);
		SuperHero SH3 = new Manray("Gyoubu Masataka Oniwa", 533);
		SuperHero SH4 = new DirtyBubble("Arnastria",666);
		SuperHero SH5 = new FlyingDutchMan("Tatenari", 36556);
		
		//add value into list		
		superHero.add(SH1);
	    superHero.add(SH2);
	    superHero.add(SH3);
	    superHero.add(SH4);
	    superHero.add(SH5);
	    
	    Collections.sort(superHero); //sorting using java.util.Collections
	    /* Collections.sort method is sorting the elements of ArrayList in ascending order */
	    
	    		//loop for show
				for(SuperHero superhero : superHero) {
					System.out.println("==========================================");
					superhero.identity();
					superhero.showPowers();
					System.out.println("==========================================");
				}
	}
}
