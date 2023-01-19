package Automation_Practice;

public class Swapping2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a= 10;
int b=15;
System.out.println("the values before swapping are a = " +a+" b= "+b);
int c=a; //creating a 3rd variable to store the value of a
a=b; // the new value of a is now 15
b=c; // the new value of b is 15
System.out.println("the values after swapping are a = " +a+ " b= "+b);

//Logic 2
int x= 25;
int y= 20;
System.out.println("before swapping = " +x+ " " +y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("after swapping = "+x+ " " +y);
	
	
	
	}

}
