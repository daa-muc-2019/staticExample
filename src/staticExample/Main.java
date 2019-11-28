package staticExample;

public class Main {

	public static void main(String[] args) {

		System.out.println("Ich bin das Hauptprogramm!");
		
		myMethod();
		
		MyStaticClass.myMethod();
		
		MyClass mc = new MyClass();
		
		mc.myMethod();
		
		MyClass.print();
		
		
		
		
	}
	
	public static void myMethod() {
		System.out.println("aus der Klasse Main!");
	}
}
