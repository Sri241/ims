package oopsdemo1;
//Program to demonstrate constructors
//Generate constructors --> Right Click --> source -> Generate Constructor
public class Trainee {
	
	private int id;
	private String name,tech;
	private double stipend;
	
	public Trainee() {
		// TODO Auto-generated constructor stub
		System.out.println("Implict Constructor");
		
		this.id=0;
		this.name="";
		this.tech="";
		this.stipend=0.0;
	}

	public Trainee(int id, String name, String tech, double stipend) {
		this.id = 111;
		this.name = "James Gosling";
		this.tech = "Java";
		this.stipend = 5000;
	}
	
	void display()
	{
		System.out.println("******Trainee Details******");
		System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
		System.out.println("---------------");
	}
    
	
}
