package Operator;

import Basis_Automation.Assignment_Operator;
import Basis_Automation.Logical_Icremental_Decremental_Operator;
import Basis_Automation.Relational_Operator;

public class Operator_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Operator: Operator in JAVA is a symbol that is used to perform operations and is used to perform operations on variables and values.
		//Variable: Variable are containers for storing data. It can be used as a container which holds value for you. In Java all the variables have to be declared first before execution. Every variable is assigned a data type.
		//Variables can be created assigning a value. Or can be created without assigning a value into it.

		//Arithmetic Operator
		//declaring variable

		int a =16, b;
		b=6;

		if (a<30) {
		System.out.println("Condition Passed");
		} else
		System.out.println("Condition Failed");

		//addition operator
		System.out.println("a + b = " + (a+b));

		//Subtraction operator
		System.out.println("a - b = " + (a-b));

		//Multiplication operator
		System.out.println("a * b = " + (a*b));

		//Division operator
		System.out.println("a / b = " + (a/b));

		//Modulo Operator
		System.out.println("a % b = " + (a%b));


		System.out.println("**Assignment Operator below**");
		Assignment_Operator assignment= new Assignment_Operator();
		assignment.assignmentoprt();


		System.out.println("**Relational Operator below**");
		Relational_Operator relational = new Relational_Operator();
		relational.Relationaloprtr();


		System.out.println("**Logical Operator below**");
		Logical_Icremental_Decremental_Operator Logical= new Logical_Icremental_Decremental_Operator();
		Logical.Logical_Operator();


		System.out.println("**Incremantal_Decrement Operator below**");
		Logical.Inc_Dec_Operator();
	}

}
