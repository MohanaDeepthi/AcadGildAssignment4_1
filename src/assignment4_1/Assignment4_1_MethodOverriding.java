//package name
package assignment4_1;
//parent class
class ParentOverrding{
		//method in parent class
	   public void myMethod()
	   {
		System.out.println("Parent Overridden method");
	   }	   
	}
	
	   
	
//child class extending parent class
public class Assignment4_1_MethodOverriding extends ParentOverrding {
	//overriding method from parent class
	public void myMethod(){
		//This will call the myMethod() of parent class
		super.myMethod();
		
		System.out.println("Child Overriding method");
	   }
	   public static void main( String args[]) {
		   //instantiating child class object
		   Assignment4_1_MethodOverriding obj = new Assignment4_1_MethodOverriding();
		   //calling method with child class object
		   obj.myMethod();
	   }

}
