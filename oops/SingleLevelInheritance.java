package oops;

class Kitchen{
	void kitchen() {
		System.out.println("What you Want to Do!");
	}
}
class Cooking extends Kitchen{
	void cooking() {
		System.out.println("I wanted to do cook!");
	}
}

public class SingleLevelInheritance {
	
	public static void main(String[] args) {
      Cooking c= new Cooking();
      c.cooking();
      c.kitchen();
	}

}
