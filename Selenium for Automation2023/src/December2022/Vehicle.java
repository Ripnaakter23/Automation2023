package December2022;

public class Vehicle { //Anything inside the curly brackets are part of the body.
    int wheels = 4; //When we add data type we have to think about the value of the attribute. Each line of statements or code has to end with ";".
    String model = "toyota"; // This list is an example of all Instance Variable
    static int year = 2022; //This in a static variable
    int openings = 4;
    double seats = 5.12345678;
    float mirrors= 5.123456f;   
    String color = "red";
    String enginetype = "gas";
    String design = "Camry";
    // We have defined the attributes or objects for the class Vehicle. 
    
    // Properties + Attributes = Objects.
    
    
    public String start() { //Instance Method
         String x = "start-key";       // Objects can be equal to variables.
        String y = "-push"; //This is a Local variable. It can only be accessed inside the method
        
System.out.println(x + y);
return x+y;
    
    }
    
    public static int startingtime() { // Static Method
         int x = 4;       // Objects can be equal to variables.
        int y = 4;
System.out.println(x+y+"seconds");
return x+y;
    
    }
   static void description() { //Instance Method
        //System.out.println(model); // model variable is a global variable can be accessed everywhere
        System.out.println(year); // year is a static variable can be accessed anywhere in the class
        //System.out.println(y);
    }
    static int accelarate(int speed) { // A variable inside method parenthesis is a parameter.
        speed = 65;
        
        if(speed > 65) {
            Vehicle camryA = new Vehicle();//instantiate inside the method to access or call the the instance method
            camryA.Slowdown();
        }
        else {
            System.out.println("keep driving");
        }
        return speed;
    }
    
     void Slowdown() {
        int i = 1;
        while(i <=10) {
            System.out.println("Break");
            i++;        }
    }
     void loadingpassenger(int passenger)
     {
         Vehicle camryP = new Vehicle();
            
            if(passenger > 5) {
                System.out.println("Overload");
            }
            else if(passenger < 5) {
                //System.out.println("keep onboarding");
                camryP.onboarding();
            }
            else if(passenger == 5) {
                System.out.println("thats it no more.. cars full");
            }
     }
            void onboarding() {
            for (int i = 1; i <= 5; i++ ) {
                System.out.println("keep onboarding");
                
            }
     }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    // Vehicle camry; !1st  This is creating the object camry.
        //camry = new Vehicle(); !2nd// Object Instantiation meaning the object will contain the properties of the class
        
        Vehicle camry = new Vehicle();// 1st + 2nd step
        
        description();
        
        camry.start();//
    
        startingtime();//Called the static method
        
        accelarate(65);
        accelarate(75);
        camry.loadingpassenger(0);
        
    
        System.out.println(camry.model); 
        System.out.println(year); 
        //System.out.println(y); cannot be accessed.
    }

}