package OOPSExamples;

public class MainClass {

	public static void main(String[] args) 
	{
		ClassA bObj = new ClassB();
		bObj.display();
	/*	ClassA aObj = new ClassA();
		aObj.display();*/
		
		bObj.readExcel();
		bObj.abstractVariable1 = "Abstract";
		Applications.abstractStaticVariable2="abstractStaticVariable2";
		
		System.out.println("Interface Variable "+ FrameworkInterface.interfaceValue1);
		
		FrameworkInterface interoBj = new ClassB();
		interoBj.getExcelData();
	}

}
