/*Write a program that gets n as input and print the factorial of a number(n!).

Testcase 1 :

Input : 

3

Expected output:

6*/
class Main {
    public static void main(String[] args) {
        int n=3;
         int fact=1;
         for (int i=1;i<=n; i++){
             fact=fact*i;
             System.out.println(fact);
             
         }
        
    }
}