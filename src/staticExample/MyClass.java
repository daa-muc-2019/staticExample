package staticExample;

public class MyClass {
	private static double PI = 3.14;
	private String myString;
	
	public  MyClass() {
		
		this.myString = "Hallo ich komme aus der Klasse MyClass";
	}
	
	public void myMethod() {
		System.out.println("aus MyClass");
	}
	public  static void print() {
		
		System.out.println(PI);
	}
	
}
