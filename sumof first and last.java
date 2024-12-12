/*Given a number N, find the sum of first and last digit of N.
 Example 1:
Input: N = 12345
Output: 6
Explanation: 1st and last digits are 1 and 5.*/
class Main{
    public static void main(String[] args){
        int n=1235;
        int lastNumber=n%10;
       // System.out.println(lastNumber);
        int firstnNumber=0;
        while(n>0){
             int div=n%10;
             n=n/10;
             firstnNumber=div;
             // System.out.println(firstnNumber);
        }
        int sum=(firstnNumber+lastNumber);
         System.out.println(sum);
        
    }
}