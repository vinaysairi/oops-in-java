package oops;

public class ConstructorTypes {
    String name;
    int age;
    ConstructorTypes(){
    	System.out.println("default constructor: ");
    }
    ConstructorTypes(String name){
    	this.name=name;
    	System.out.println("Parameter constructor : "+this.name);
    }
    ConstructorTypes(String name,int age){
    	this.name=name;
    	this.age=age;
    	System.out.println("Name : "+this.name);
    	System.out.println("Age : "+this.age);
    }
    //copy constructor
    ConstructorTypes(ConstructorTypes cobj){
    	name=cobj.name;
    	age=cobj.age;
    	System.out.println("Copy Constructor");
    	System.out.println("Name : "+this.name);
    	System.out.println("Age : "+this.age);
    }
	public static void main(String[] args) {
		ConstructorTypes c = new ConstructorTypes();
		ConstructorTypes c1 = new ConstructorTypes("Vinay");
		ConstructorTypes c2 = new ConstructorTypes("vinay",22);
		ConstructorTypes c3= new ConstructorTypes(c2);
 }
}
