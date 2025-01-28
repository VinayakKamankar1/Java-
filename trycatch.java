import java.util.*;
import java.io.*;

public class trycatch {
    public static void main (String [] args){
        Scanner scanner=new Scanner(System.in);

       double bal;
       int withdraw;
          System.out.println("enter the balance");
          bal=scanner.nextDouble();

       try{
        System.out.println("enter the withdraw amount");
        withdraw=scanner.nextInt();
        if(withdraw<=bal){
            System.out.println("withdraw amount succes");
        }
       }

       catch(Exception e){
        System.out.println("error");

       }
    }
}