//Write a program to check whether a triangle can be formed with the given values for the angles.

//If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter a input");
        Scanner scan=new Scanner (System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int sum=(a+b+c);
        if(sum==180){
             System.out.println("Triangle can be formed");
        }else{
            System.out.println("Triangle  cannot be formed");
        }
        
    }
}