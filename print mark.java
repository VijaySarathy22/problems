/*Given mark of student, Print the Grade
Grade A if mark is greater than or equal to 90
Grade B if mark is greater than or equal to 80
Grade C if mark if greater than or equal to 60
Grade D if mark if greaer than or equal to 35
Fail if mark is lesser than 35
Input: 95
Expected Output:
Grade A
Explanation: Here 95 is greater than or equal to 90 so its Grade A*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter a input");
        Scanner scan=new Scanner (System.in);
        int mark=scan.nextInt();
        if(mark>=90){
             System.out.println("grade A");
        }
        else if(mark>=80){
            System.out.println("grade B");
            }
            else if(mark>=60){
            System.out.println("grade C ");
            }
            else if(mark>=35){
            System.out.println("grade D");
            }
            else{
                System.out.println("fail");
            }
    }
}