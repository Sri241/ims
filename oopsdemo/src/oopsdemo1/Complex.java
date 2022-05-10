package oopsdemo1;
//Program to add to complex numbers
public class Complex {
	double real;
	double imaginary;
	
	//Generate Constructor using fields
	public Complex(double real, double imaginary) {
		this.real = real;//Parameterized Constructor
		this.imaginary = imaginary;
	}
	
	void add(Complex obj) // method which accepts object as an argument
    {
		//c1.real+=c2.real
       this.real+=obj.real;
       this.imaginary+=obj.imaginary;
       
    }
   
    void display()
    {
        //System.out.println("The Addition of 2 Complex Numbers is :");
        System.out.println("r"+this.real+" + i"+this.imaginary);
    }
	
     
}
