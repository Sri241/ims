package oopsdemo3;
//Rectangle class is implementing shape interface
public class Rectangular implements Shape {
     
	
	private double width;
    private double height;
    
    //generate constructor using fields
	public Rectangular(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangular");
	}

	@Override
	public double getArea() {
		return this.height*this.width;
		
	}

}
