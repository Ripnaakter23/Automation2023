package Automation_Practice;

public class Reverse_String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String a= "ripna";
	        String b="";
	        System.out.println("original string is" + a);
	        for(int i=0; i<a.length();i++) {
	        b=a.charAt(i) + b;	
	       }
	       System.out.println("reversed string is " + b); 

	       String c= "ata";
	        String d ="";
	        
	        for(int i= 0; i<c.length(); i++) {
	        	
	        	d = d + c.charAt(i);
	        }	
	        
	       
		if( c.equalsIgnoreCase(d)){
		    System.out.println("this is a palindrome");
		}
		else {
			System.out.println("this is not a palindrome");
		}

		}
	
	//reverse string
	// number swap
	// palindrome
	
	
	
}


