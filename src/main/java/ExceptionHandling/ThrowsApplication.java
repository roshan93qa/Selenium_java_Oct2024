package ExceptionHandling;

public class ThrowsApplication {
	//java.lang.ArithmeticException:
	
	public void m1() throws ArithmeticException{
		System.out.println("m1 method");
		m2();
	}
	public void m2() throws ArithmeticException{
		System.out.println("m2 method");
		try {
			m3();
		}catch (ArithmeticException e) {
			System.out.println("AE is coming ");
			
		}
	
		
	}
	public void m3() throws ArithmeticException {
		System.out.println("m3 method");
		int i=9/0;
		
	}
	
	
	

	public static void main(String[] args)throws ArithmeticException {
		ThrowsApplication obj=new ThrowsApplication();
		obj.m1();
		System.out.println("Bye");
		
		
		
	}

}
