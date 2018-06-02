package OOPSExamples;

public abstract class Applications 
{

	String abstractVariable1 ;
	static String abstractStaticVariable2;
	abstract void getApplicationData();
	//abstract void getApplicationData(int a);

	Applications()
	{
		System.out.println("This is a constructor in abstract class Applications");
	}
	void printApplicationName(String appName)
	{
		System.out.println("This is a concerete method in abstract class for Applicaation Name :"+appName);
	}

}
