package basics;

import java.util.Scanner;

public class SwitchDemo2 {
	public static void main(String[] args) {
		int number;
        String size="";
        Scanner s=new Scanner(System.in);
       
        System.out.println("Enter ur Shirt Size:");
        number=s.nextInt();
        s.close();
        /*  switch statement to check size
        switch((1 <= number && number <= 28)?1:
        	(29 <= number && number <= 41)? 29:42) {
        
    case 1:
        
        size="Kids";
        break;
  case 29:
      size = "Small";
      break;



   case 42:
      size = "Medium";
      break;




}
*/
        if(number >=1 && number <=50)
        	System.out.println("Kid");
        else  if(number >=51 && number <=100)
        	System.out.println("medium");
        else if(number >=101 && number <=200 )
        	System.out.println("Large");
        else
        	System.out.println("Invaild");
        	//System.out.println("Size:"+ size);
          //System.out.println("Size: " + size);
	}

}
