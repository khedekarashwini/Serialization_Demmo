package com.serialization123;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Student implements Serializable
{
  int id;
  String name;
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
  
 


}

public class Serialization_demo {
	public static void main(String[] args) {
		
		Student s1=new Student(12, "abc");
		  String filename="My_File.txt" ;
		  
		  try
		  {
			FileOutputStream f_out=new FileOutputStream(filename);
		    ObjectOutputStream f_outs= new ObjectOutputStream(f_out);
		      f_outs.writeObject(s1);
		      System.out.println("Serialized.....");
		  } 
		  
		  catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				  
				  
		try {
			FileInputStream f_in=new FileInputStream(filename);
		     ObjectInputStream f_ino=new ObjectInputStream(f_in);
		    Student s2= (Student) f_ino.readObject();
		    System.out.println("Object is deserialized");
		    
		    System.out.println("Id.."+s2.id);
		    System.out.println("Name.."+s2.name);
		
		} 
		catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	
	
	}

}
