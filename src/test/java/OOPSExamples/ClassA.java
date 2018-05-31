package OOPSExamples;

public class ClassA {

	private int a =10;
	
	static int b ;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void display()
	{
		System.out.println("Value in ClassA :- "+ a);
		
		System.out.println("Calling static method inside non static method");
		method1(); // Static method can be called inside non static methods
		b=30; // static member can be called inside non static methods
	}
	
	public static void method1()
	{
		//display(); Cannot call non static methods inside static method
		//a=20; Cannot call non static variables inside static method.
		System.out.println("This is a static method ");
		b=20; 
		
		
	}
}
