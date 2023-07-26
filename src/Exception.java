import java.io.*;
public class Exception {
	public static void main(String args[]){ 
		int a=10,b=0,c;
		try{
			String s=null;
			  c=a/b;
			  int num[]= {1,3,2,4};
			  System.out.println(num[10]);  
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			}
	
		finally {
			System.out.println("testing");
		}
		System.out.println("test");
	}
	
	}


