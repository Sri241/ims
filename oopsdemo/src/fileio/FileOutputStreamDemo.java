package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		String fname="c:/demo/data1.txt";
		
		try
		{
		FileOutputStream fos=new FileOutputStream(fname);
		
		String text="It's a Beautiful day";
		
		String text1="It's a Sunny Day";
		
		byte[] myBytes=text.getBytes();
		
		fos.write(myBytes);
		
		byte[] myBytes1=text1.getBytes();
		
		fos.write(myBytes1);
		
		
		
		System.out.println("Data Written in Binary Format");
		
		fos.close();
		
		
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		
	}catch(IOException e) {
		e.printStackTrace();
		
	}
		
	}
}
