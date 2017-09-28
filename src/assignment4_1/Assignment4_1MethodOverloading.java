//package name
package assignment4_1;
import java.util.*;
//class  with overloading methods
class OverloadingMethods
{
	
	public void add(int a, int b)
	{
	            System.out.println("Sum of two="+(a+b));
	}

	public void add(int a, int b,int c)
	{
	            System.out.println("Sum of three="+(a+b+c));
	}

	public void add(int a,double b){
		System.out.println("Sum of int and float="+(a+b));
	}

	public void add(int a,float b){
		System.out.println("Sum of int and float="+(a+b));
	}


}
//class to execute the overloading methods
public class Assignment4_1MethodOverloading {
	public static void main(String args[]){
		//instantiating OverloadingMethods class
		OverloadingMethods s1=new OverloadingMethods();
		//Instantiating Scanner object
		Scanner i1=new Scanner(System.in);
		System.out.println("Please enter 5 values");
		//Taking input from user
		int a=i1.nextInt();
		int b=i1.nextInt();
		int c=i1.nextInt();
		float d=i1.nextFloat();
		double e=i1.nextDouble();
		//calling overloading methods
		s1.add(a, b);
		s1.add(a, e);
		s1.add(a, b, c);
		s1.add(a, d);
		
		//closing scanner
		i1.close();
	}

}
