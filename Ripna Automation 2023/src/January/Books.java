package January;

public class Books {
	String Genres = "Fiction, Novel, Mystery";		//instance variable
	static int Quantity= 450;						// static variable
	static double Price = 25.66;					//also a static variable
	String CoverFormat= "HardCover Books";			//instance variable
	static int Customers=30;						// static variable
	
	
 static void billing() {
	System.out.println(Quantity * Price);	
	int MaleCustomer= 10;
	int FemaleCustomer= 20;
	
	if(MaleCustomer>FemaleCustomer) {
		System.out.println("this is wrong");
	}
		else {
		System.out.println("this is correct");
			}
	
	}
 
 
static int customerInfo(int NumberOfCustomers) {
	NumberOfCustomers = 10;
for(int i=4; i<9; i++) 
System.out.println(NumberOfCustomers);
return NumberOfCustomers;



	
	
}




public static void main(String[] args) {
		
// TODO Auto-generated method stub
	Books a= new Books();                    //instantiating object "a" so it will now obtain all the properties of the class.
	billing();
	System.out.println(a.Genres);            //printing out instance variable "Genres" with the help of object "a"
	System.out.println(Books.Customers);     // accessing static variable with the class name
	customerInfo(0);						 //can be accessed directly because this is a static method
	}

}
