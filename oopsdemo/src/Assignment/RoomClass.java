package Assignment;

public class RoomClass {
      int roomNumber;
      String roomType;
      float roomArea;
      boolean acMachine;
      
      void setData(int rno, String rt, float area,boolean ac )
      {
    	  roomNumber=rno;
    	  roomType=rt;
    	  roomArea=area;
    	  acMachine=ac;
      }
      void displayData()
      {
    	  System.out.println("********RoomDetails*******");
    	  System.out.println("The roomNumber is:"+roomNumber);
    	  System.out.println("The roomType is:"+roomType);
    	  System.out.println("The roomArea is:"+roomArea);
    	  System.out.println("The acMachine is"+acMachine);
      }
      public static void main(String[] args) {
		RoomClass r1=new RoomClass();
		r1.setData(101,"Resturant",160.0f,true);
		r1.displayData();
		
		RoomClass r2=new RoomClass();
		r2.setData(102,"Luxury",130.0f,false);
		r2.displayData();
	}
      
}
