package OOPSExamples;

public class ClassA extends Applications implements FrameworkInterface
{

	private int a =10;

	static int b ;

	String name ="Pavan";

	public ClassA()
	{
		System.out.println("This is constructor of Class A");
		System.out.println("***Exiting Constructor in ClassA***");
	}

	ClassA(String a )
	{
		System.out.println("This is a overLoaded constructor in Class with Value :- " +a);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public void getApplicationData() 
	{
		System.out.println("Implementing abstract method getApplicationData() from abstract Application Class in Class A ");
	}

	public void display()
	{
		System.out.println("****** This is Method - display() in Class A ****** ");
		System.out.println("Value in ClassA :- "+ a);

		System.out.println("Calling static method inside non static method");
		method1(); // Static method can be called inside non static methods
		b=30; // static member can be called inside non static methods

		System.out.println("***Exiting Method - display() in ClassA***");
	}

	public static void method1()
	{
		//display(); Cannot call non static methods inside static method
		//a=20; Cannot call non static variables inside static method.
		System.out.println("This is a static method1() ");
		b=20; 

		System.out.println("***Exiting Method - method1() in ClassA***");
		
	}


	@Override
	public void readExcel() {
		// TODO Auto-generated method stub
		System.out.println("This is readExcel() method from Framework Interface");
	}


	@Override
	public void getExcelData() {
		// TODO Auto-generated method stub
		System.out.println("This is getExcelData() method from Framework Interface");

		System.out.println("Calling interface variable "+ interfaceValue1);
	}


	@Override
	public void getColumnIndex() {
		// TODO Auto-generated method stub
		System.out.println("This is getColumnIndex() method from Framework Interface");
	}

}
