package priv.xzc.se300Season1.exception;

public class ExceptionTest {
	public static void main(String[] args) {
		
		encapsulateMethodException();
	}
	
	
	public static void encapsulateMethodException(){
//		Exception e = new 
		System.out.println("Work on it ...");
		try {
			int[] a = {1,2,3};
			int index = 3;
			//ArrayIndexOutOfBoundSExceptioin
			System.out.println(a[index]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("The end");
	}
}
