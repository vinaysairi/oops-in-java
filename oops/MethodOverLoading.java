package oops;

public class MethodOverLoading {
	//Real time example of polymorphism: Compile Time Polymorphism: Method Overloading
	//area of circle
	 void area(float radius) {
		float pie = 3.14f;
		System.out.println("Area of cirlcle : "+(pie*radius*radius));
	 }
	 //area of Square
	 void area(int side) {
		 System.out.println("Area of Square : "+side*side);
	 }
	 //area of triangle
	 void area(int base,float height) {
		 float half = 0.5f;
		 System.out.println("Area of Triangle : "+(half*base*height));
	 }
	 //Area of Rectangle
	 void area(int a, int b) {
		 System.out.println("Area of Rectangle : "+(a*b));
	 }
 public static void main(String[] args) {
	 MethodOverLoading m = new MethodOverLoading();
	 m.area(3.0f);
	 m.area(5);
	 m.area(5, 3.2f);
	 m.area(5, 4);
 }
}
