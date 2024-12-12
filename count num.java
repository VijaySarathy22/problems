//Write a program that gets n as input and print the number of digits in the number
//Testcase 1 :
//input : 
//325345
//Expected output:
//6
class Main{
   public static void main(String[] args) {
       int n=325345;
       int count=1;
       while(n>0){
           int ld=n%10;
           n=n/10;
           System.out.println(count);
           count++;
       }
      }    
}