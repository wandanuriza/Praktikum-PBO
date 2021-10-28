package Cylinder;

public class TestCylinder { 
	public static void main (String[] args) {
		// Declare and allocate a new instance of cylinder -- deklarasi objek baru (c1) dari Cylinder
		// with default color, radius, and height -- menggunakan color,radius,height default
		Cylinder c1 = new Cylinder();
		System.out.println("Cylinder:"
			+ " radius=" + c1.getRadius()
			+ " height=" + c1.getHeight()
			+ " base area=" + c1.getArea()
			+ " volume=" + c1.getVolume());

		// Declare and allocate a new instance of cylinder -- deklarasi objek baru (c2) dari Cylinder
		// specifying height, with default color and radius --menggunakan color,radius default tapi height di set manual
		Cylinder c2 = new Cylinder(10.0);
		System.out.println("Cylinder:"
			+ " radius=" + c2.getRadius()
			+ " height=" + c2.getHeight()
			+ " base area=" + c2.getArea()
			+ " volume=" + c2.getVolume());

		// Declare and allocate a new instance of cylinder -- deklarasi objek baru (c3) dari Cylinder
		// specifying radius and height, with default color --menggunakan color default tapi radius,height di set manual
		Cylinder c3 = new Cylinder(2.0, 10.0);
		System.out.println("Cylinder:"
			+ " radius=" + c3.getRadius()
			+ " height=" + c3.getHeight()
			+ " base area=" + c3.getArea()
			+ " volume=" + c3.getVolume());
		
		// Memanggil toString()
		System.out.println("\n");
		System.out.println(c1.toString());
	    System.out.println(c2.toString());
	    System.out.println(c3.toString());
	}
}

