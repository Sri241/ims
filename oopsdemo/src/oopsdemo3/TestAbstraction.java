package oopsdemo3;

public class TestAbstraction {
      
	public static void main(String[] args) {
		
		Bike obj=new Honda(); //upCasting
		
		obj.run();
		obj.changeGear();
	}
}
