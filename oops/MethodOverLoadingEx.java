package oops;
class Addition{
	static int add(int a, int b) {
		return a+b;
	}
	static float add(int a,float b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;	
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class MethodOverLoadingEx {

	public static void main(String[] args) {
		System.out.println("Function with int return type : "+Addition.add(3, 5));
		System.out.println("Function with float return type : "+Addition.add(3, 2.5f));
		System.out.println("Function with double return type : "+Addition.add(10.2, 2.8));
		System.out.println("Function with int return type with three parameters : "+Addition.add(2,3,5));
     
	}

}
