package fundamentos;

public class Wrappers {

	
	public static void main(String[] args) {

		Byte b = 100;			//Byte
		Short s = 1000;			//Short
		Integer i = 10000;		//Integer
		Long l = 100000L;		//Long
		Float f = 500.2312F;	//Float
		Double d = 210.332;		//Double
		Character c = 'd';		//Character
		Boolean bo = Boolean.parseBoolean("true");		//Boolean
		
		System.out.println(b.byteValue() + " >Byte");	//Byte
		System.out.println(s.toString() + " >Short");	//Short
		System.out.println(i * 3 + " >Integer");		//Integer
		System.out.println(l / 3 + " >Long");			//Long
		System.out.printf("%.2f >Float%n", f / 2);		//Float
		System.out.println(d); 							//double
		System.out.println(c.toString().toUpperCase() + " >Character");		//Character
		System.out.println(bo.toString().toUpperCase() + " >Boolean");		//Boolean
		
	}
}
