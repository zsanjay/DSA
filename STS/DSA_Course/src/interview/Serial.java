package interview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial implements Serializable{

	
	public String name;
	public int age;
	
	
	public Serial()
	{
		System.out.println("Default Constructor");
	}
	
	public Serial(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return name+" "+age;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		Serial serial = new Serial("Sanjay", 25);
		
		FileOutputStream fileOutputStream = new FileOutputStream("sanjay.txt");
		
		ObjectOutputStream object = new ObjectOutputStream(fileOutputStream);
		
		object.writeObject(serial);
		
		object.close();
		fileOutputStream.close();
		
		
		FileInputStream input = new FileInputStream("sanjay.txt");
		
		ObjectInputStream obj = new ObjectInputStream(input);
		
		Serial s = (Serial)obj.readObject();
		
		
			System.out.println(s);	
				

	}
	

}
