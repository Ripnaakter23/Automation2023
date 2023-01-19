package Automation_Practice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter your string:");
	String str= sc.next();	
	String org_str= str;
	String rev="";
	//int len=str.length();
	for(int i = 0; i<str.length();i++) {
		rev= rev+str.charAt(i); 
	}
	if(org_str.equals(rev))	{
	System.out.println(org_str+" is a palindrome String");	
	}
	else {
		System.out.println(org_str+" is not palindrome String");
	}	
		
	}

}
