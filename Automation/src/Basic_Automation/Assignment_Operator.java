package Basic_Automation;

public class Assignment_Operator {
	public void assignmentoprt() {
		//Creating Variable
		int a= 6;
		int var;

		//Assigning value
		var = a;
		System.out.println("var using =" +var);

		//Assigning value using +=
		var += a; //Means var= var+a
		System.out.println("var using +=" + var);

		//Assigning value using *=
		var *= a; //Means var= var x a ;var 12 a 6
		System.out.println("var using *=" + var);
}
}