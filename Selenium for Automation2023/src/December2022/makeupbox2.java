package December2022;

public class makeupbox2 {
String lipstickcolor="red";
int lipstickprice=15;
float lipstickweight = 1.66f;
String lipstickbrand= "loreal";
double lipstickquantity=10.66;
boolean correct= true;

public double calculateweight (float x, double y) {
	lipstickweight=x;
	lipstickquantity=y;
	float z= (float) (x+y);
	System.out.println(z);
	return z;
	
}


public double calculateweight2() {
	double z= lipstickweight*lipstickquantity;
	System.out.println(z);
	return z;
}

public void verifycolor() {
if(lipstickcolor=="blue") {
System.out.println("correct");	;
}
else {
	System.out.println("wrong color");
}
}
	
public makeupbox2(String lipstickcolor,int lipstickprice, float lipstickweight ,double lipstickquantity) {
this.lipstickcolor=lipstickcolor;
this.lipstickprice=lipstickprice;
this.lipstickweight=lipstickweight;
this.lipstickquantity=lipstickquantity;
//this.correct=correct;	
	
}	
	




public static void main(String[] args) {
		// TODO Auto-generated method stub
	makeupbox2 lipstick;
	lipstick= new makeupbox2("red",5,12.22f,13.44);
	lipstick.calculateweight2();
	//System.out.println(lipstick.lipstickcolor);
	lipstick.verifycolor();
	
	makeupbox2 lipstick1= new makeupbox2("green", 6, 5.78f, 14.878);	
	//System.out.println(lipstick1.lipstickcolor);
	lipstick1.verifycolor();
		
	makeupbox2 lipstick2= new makeupbox2("red", 6, 5.78f, 14.878);	
	//System.out.println(lipstick2.lipstickcolor);
	lipstick2.verifycolor();
			
	}

}
