//CMIS141_Homework4
//Homework 4
//Programmer: Jason M. Rimer
//Date: 17MAR2012
//This program calls the class Cube that constructs a
//	cube of new dimensions and displays the surface area
//	and the volume of the constructed Cube.

public class Main {// startPublicClass

	public static void main(String[] args) {//startMainMethod
		
		//Call Cube to create a new cube with dimensions 5, 10, 15
		Cube cube1 = new Cube(5, 10, 15);
		
		//Print surface area 
		System.out.println("The surface area is " + cube1.getSurfaceArea());
		
		//Print volume
		System.out.print("The volume is " + cube1.getVolume());
 
	}// endMainMethod
	
}// endpublicClass

