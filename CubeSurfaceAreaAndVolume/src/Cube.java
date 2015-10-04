//CMIS141_Homework4
//Homework 4
//Programmer: Jason M. Rimer
//Date: 17MAR2012
//This program creates the class Cube that constructs a
//	cube of new dimensions and returns the surface area
//	and the volume of the constructed Cube.

public class Cube {// startPublicClass
	
	//Allocate height, width, and length
	double height = 0;
	double width = 0;
	double length = 0;
	
	//Construct cube with new sides
	Cube(double newHeight, double newWidth, double newLength) {
		height = newHeight;
		width = newWidth;
		length = newLength;			
	}
		
	double getSurfaceArea() {
		return height * width * 2 + height * length * 2 + length * width * 2;
	}
		
	double getVolume() {
		return height * width * length;
	}
	
	}// endCubeclass