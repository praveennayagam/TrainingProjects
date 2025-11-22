package com.mphasis;

public class DemoOnException {

	public static void main(String[] args) {
//		
//		int a=5,b[]= {2,4,4,5};
//		
//		String s=null;
//		
//		//System.out.println(s.charAt(5));
//		
//		try {
////			for(int i=0;i<=b.length;i++)
////			System.out.println(a/b[i]);
//			
//			System.out.println(s.charAt(5));
//		}
//		catch(NullPointerException npe)
//		{
//			npe.printStackTrace();
//		}
//		catch(ArithmeticException ae)
//		{
//			ae.printStackTrace();
//		}
//		catch(ArrayIndexOutOfBoundsException ae)
//		{
//			ae.printStackTrace();
//			System.err.println(ae.getMessage());
//		}
//		
//		catch(RuntimeException re) {
//			re.printStackTrace();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		
		String s=null;
		extractString(s);
		System.out.println("Application closed successfully");

	}

	public static void extractString(String s) {
		if(s==null)
			throw new NullPointerException();
		else
			System.out.println(s.charAt(5));
		
	}

}
