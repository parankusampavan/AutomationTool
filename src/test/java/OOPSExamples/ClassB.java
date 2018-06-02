package OOPSExamples;

public class ClassB extends ClassA
{
	String name ="Parankuam";
	
	ClassB()
	{
		
		super("abc");
		//super(); Cannot invoke two constructors which are overloaded in another class in another constructor
		System.out.println("This is constructor of Class B");//Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
		
		System.out.println("Calling Class A method from Class B constructor using super keyword");
		System.out.println("Calling Class A method using super keyword - "+ super.getA());//Super can also be used even though the method and instance names are different
		
		
		getApplicationData();
		System.out.println("***Exiting Constructor in ClassB***");
		
		
	}
	
	@Override
	public void display()
	{
		//super(); cannot call constructor in concrete method
		System.out.println("***Entering Method - display() in ClassB***");
		setA(20);
		System.out.println("Value -"+ getA());
		
		System.out.println(name + "-"+ super.name );// calling class A "name" variable using super keyword
		
		System.out.println("*******Calling Parent Class Method using super keyword*******");
		super.display();// Calling Class A method using super keyword
		
		System.out.println("***Exiting Method - display() in ClassB***");
	}

	/*public void method1()
	{
		cannot override static method in parent class
		because static method is bound with class whereas instance method is bound with object. Static belongs to class area and instance belongs to heap area.
	}*/
	
}
