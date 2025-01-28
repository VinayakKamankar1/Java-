//import java.util.*;
//import java.io.*;

//class InsufficientFundsexception extends Exception  {
/*     public InsufficientFundsexception(String s )
        {
            super(s);
        }
    }
    class main {
        public static void main (String [] args){
        Scanner scanner=new Scanner(System.in);

    try{

        double bal;
        int withdraw;
        System.out.println("enter the balance");
        bal=scanner.nextDouble();

        System.out.println("enter the withdraw amount");
        withdraw=scanner.nextInt();

        if(withdraw>=bal){
            throw new InsufficientFundsexception("");
        }
        else{
            System.out.println("succes");
        }
    }

    catch(InsufficientFundsexception e )
        {
        System.out.println("error"+e.getMessage());
        }
    }
}


public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter two numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();

    System.out.println("Operations : 1.Addition  2.Subtraction  3.Multiplication  4.Division ");
    int choice=sc.nextInt();

    switch(choice){

    case 1:
    System.out.println("Additon of two numbers is : "+(a+b));
    break;

    case 2:
    System.out.println("Subtraction of two numbers is : "+(a-b));
    break;

    case 3:
    System.out.println("Multiplication of two numbers is : "+(a*b));
    break;

    case 4:
    System.out.println("Division of two numbers is : "+(a/b));
    break;

    default :
    System.out.println("Invalid Number");

        }
        sc.close();
    }
}
*/




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int totalSteps=0;

    
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter steps for day " + (i + 1) +" : ");
            totalSteps += scanner.nextInt();
        }

        // Calculate and display total and average steps
        System.out.println("\nTotal steps for the week: " + totalSteps);
        System.out.println("Average steps per day: " + (totalSteps / 7.0));


    }
}


