//to print input from the user
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter a input");
        Scanner scan=new Scanner (System.in);
        int num=scan.nextInt();
        String name =scan.next();
        char name1=scan.next().charAt(0);
        System.out.println(num);
        System.out.println(name);
        System.out.println(name1);
    }
}