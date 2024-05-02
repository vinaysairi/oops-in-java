package oops;

import java.util.Scanner;

import oops.Parent.Child;

class Parent{
	String f_name = "sRIKANTH";
	int f_age=20;
	public Parent(String f_name, int f_age) {
		this.f_name = f_name;
		this.f_age = f_age;
		System.out.println("Father Name : "+f_name + " "+ "Age : "+f_age);
	}
	void parent() {
	System.out.println("Name : "+f_name);
}
class Child extends Parent{
   String f_name = "VINAY";
   int f_age = 20;
	public Child(String f_name, int f_age) {
		super(f_name , f_age);
		this.f_name=f_name;
		this.f_age=f_age;
		System.out.println("Child Name : "+f_name + " "+ "Age : "+f_age);
		super.parent();
		
	}
	
}
	
}
public class SingleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Child c= new Child("vinay", 22);
	}

}
