package Automation_Practice;

public class Reverse_String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String a= "ripna";
	        String b="";
	        System.out.println(a);
	        for(int i=0; i<a.length();i++) {
	        b=a.charAt(i) + b;	
	       }
	       System.out.println("reversed string is " + b); 
	}

}
