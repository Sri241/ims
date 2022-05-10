package oopsdemo1;
//Program to demonstrate constructor in java
class Language{
	private String s;
	private int version;
	
	Language()//implicit constructor
	{
		System.out.println("I am a Implicit Constructor");
		s="Python";
		System.out.println("Hello from: "+s);
	}
	Language(String lang){//Parameterized Constructor
		System.out.println("I m a Parameterized Constructor");
		this.s=lang;
		System.out.println("Hello from: "+s);
	}
	Language(String lang,int ver)
	{
		System.out.println("I am Parameterized Constructor with 2 Aruguments");
		this.s=lang;
		this.version=ver;
		System.out.println("Hello from : "+s+" V."+version);
	}
}
public class LanguageDemo {
	public static void main(String[] args) {
		Language l1=new Language();//automatically invoke implicit constructor
		Language l2=new Language("Ruby");//automatically invoke parameterized constructor
		Language l3=new Language("Scala");
		Language l4=new Language();
		Language l5=new Language("Java",2);
	}
      
}
