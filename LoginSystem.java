import java.util.Scanner;
import java.util.Random;
public class LoginSystem{
static final int YEAR=2025;

    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        boolean information=false;
        
        System.out.print("Please enter your name: ");
        String name=input.nextLine();
        System.out.println();
        System.out.print("Please enter your year born:");
        int year_born=input.nextInt();
        input.nextLine();
        int age=YEAR-year_born;
        System.out.println("Your age is: "+age);
            
            if(age<18){
                System.out.println("Your age is too low.");
                return;
            }
        
        System.out.println();
        System.out.print("Please enter your new password: ");
        String password=input.nextLine();
        System.out.println();
        System.out.print("Please enter your password again: ");
        String password2=input.nextLine();
        
          while(!password.equals(password2)){
              System.out.println("The second password is not same as first password! Please type again. ");
              System.out.println();
              System.out.print("Please enter your password again: ");
              password2=input.nextLine();
          }
        
        int passcode=random.nextInt(999999)+100000;
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
        
        information=true;
        
            if(information==true){
                System.out.println("Checking information....");
                System.out.println("You are sucessfully login! ");
                System.out.println("Welcome "+name+"!");
            }
        
    }
}