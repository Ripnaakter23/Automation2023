package Basis_Automation;

public class Logical_Icremental_Decremental_Operator {
	public void Logical_Operator() {

		//&& operator (Logical AND)
		System.out.println((5>3) && (8>5)); //true only if both expression1 and expression2 are true
		System.out.println((5>3) && (8<5)); //true only if both expression1 and expression2 are true

//		    || operator (Logical OR)
		System.out.println((5<3) || (8>5)); //true only if either expression1 or expression2 are true
		System.out.println((5<3) || (8<5)); //true only if either expression1 or expression2 are true

		//! Operator (Logical NOT)
		System.out.println(!(5==3)); //true if expression is false and vice versa
		System.out.println(!(5>3)); //true if expression is false and vice versa
		}

		public void Inc_Dec_Operator() {


		int a= 12, b=12;
		int result1, result2;

		//++ Incremental
		result1= ++a;
		System.out.println("After increment: " + result1);



		//-- Decremental
		result2 = --b;
		System.out.println("After decrement " +result2);

		}
}
