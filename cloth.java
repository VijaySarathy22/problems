/*Write a program using switch case which takes a value and prints the respective Size.
If size is 29 then its small
If size is 30 then its Medium
If size is 38 then its Large
If size is 42 then its XLarge
If size is not any of the above then Invalid.
Input: 29
Expected Output: */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter a input");
        Scanner scan=new Scanner (System.in);
        int size =scan.nextInt();
        switch (size){
             case 42:
                 System.out.println("XLLARGE");
                 break;
            case 38:
                 System.out.println("MEDIUM");
                  break;
            case 30:
                 System.out.println("LARGE");
                  break;
            case 29:
                 System.out.println("SMALL");
                  break;
            default:
                 System.out.println("invalid");
        }
        
    }
}