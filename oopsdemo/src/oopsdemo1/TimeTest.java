package oopsdemo1;

public class TimeTest {
    
	public static void main(String[] args) {
		
		Time t1=new Time(12,45,55);//invoke Constructor & initilialize the value
		Time t2=new Time(10,30,30);
		
		t1.add(t2);//invoke add method & pass t2 object as argument
		
		System.out.println("The addition of 2 Times is: ");
	}
}
