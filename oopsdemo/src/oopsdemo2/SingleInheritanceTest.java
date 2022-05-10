package oopsdemo2;
//Parent Class/base class/super class
class Animal
{
	String name;//Properties
	
	public void eat()//methods
	{
		System.out.println("I can Eat");
	}
}
//Inherits Animal class
//Child/Sub/derived class
class Dog extends Animal
{
	public void display()
	{
		System.out.println("My name is : "+name);
	}
	
}

public class SingleInheritanceTest {
      public static void main(String[] args) {
		
    	  //create&initialize object of sub class
    	  Dog labrador=new Dog();
    	  
    	  
    	  //access field of super class
    	  labrador.name="Simbha";
    	  
    	  //call method of derived class using derived class object
    	  labrador.display();
    	  
    	  //call method of super class using derived class object
    	  labrador.eat();
	}
}
