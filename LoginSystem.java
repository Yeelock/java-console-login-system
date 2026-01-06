// A simple console-based login system for learning purposes.
// This program simulates a basic login flow and does not implement real security or data storage.

import java.util.Scanner; 
import java.util.Random;
public class LoginSystem{
static final int CURRENT_YEAR=2026;

    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        
        System.out.print("Please enter your name: ");
        String name=input.nextLine();
        System.out.println();
        System.out.print("Please enter your year born:");
        int year_born=input.nextInt();
        input.nextLine();  //Clear leftover newline after nextInt();
        int age=CURRENT_YEAR-year_born;
        System.out.println("Your age is: "+age);
            
            if(age<18){
                System.out.println("Your age is too low.");
                return;
            }
        
        System.out.println();  //new line (same as \n)
        System.out.print("Please enter your new password: ");
        String password=input.nextLine();
        System.out.println();
        System.out.print("Please enter your password again: ");
        String password2=input.nextLine();
        
          while(!password.equals(password2)){ //check until the second password same as first password
              System.out.println("The second password is not same as first password! Please type again. ");
              System.out.println();
              System.out.print("Please enter your password again: ");
              password2=input.nextLine();
          }
        
        int passcode=random.nextInt(900000)+100000;
        System.out.println("Captcha: "+passcode);
        System.out.println("Please enter the same passcode above");
        int code=input.nextInt();
        input.nextLine();
        
            while(code!=passcode){
                System.out.println("Passcode Captcha not right! ");
                passcode=random.nextInt(999999)+100000;
                System.out.println("Captcha: "+passcode);
                System.out.println("Please enter the same passcode above");
                code=input.nextInt();
                input.nextLine();
                
            }
        
            System.out.println("Checking information....");
            System.out.println("You are sucessfully logged in! ");
            System.out.println("Welcome "+name+"!");
        
    }

}
