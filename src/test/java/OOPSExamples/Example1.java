package OOPSExamples;

public class Example1 
{
	int id;  
	String name; 
	void display()
	{
		System.out.println(this.getClass());
		System.out.println(this.getClass().getName());
		System.out.println(Example1.class.getName());
		System.out.println(id++ +" "+name);
		
		int x = 5, y;
		 
		// Demonstrating prefix increment
		// first x will be incremented then
		// updated value of x will be assigned to y
		y = ++x;
		System.out.println("y : " + y); //will print y : 6
		System.out.println("x : " + x); //will print x : 6
		 
		// Demonstrating postfix increment
		// first value of x will be assigned to y
		// then x will be incremented
		y = x++;
		System.out.println("y : " + y); //will print y : 6
		System.out.println("x : " + x); //will print x : 7
		 
		//If increment is made in an independent
		//statement, prefix and postfix modes make no difference.
		++x;
		System.out.println("x : " + x); //will print x : 8
		 
		x++;
		System.out.println("x : " + x); //will print x : 9
	}  
	public static void main(String[] args) {
		
		Example1 s1=new Example1();  
		  
		s1.display();  
		
	}


}
