//Given two numbers A and B, find Kth digit from right of AB.
//Input:
//A = 3
//B = 3
//K = 1
//Output:
//7 Explanation: 33 = 27 and 1st digit from right is 7
class Main {
    public static void main(String[] args) {
      int a=3,b=3,k=2;
      long power=(long)Math.pow(a,b);
      System.out.println(power);
      long i=1;
      while (power>0){
          if (k==i){
              long ans=power%10;
              System.out.println(ans);
              break;
          }
           i++;
          power=power/10;
          
      }
        
    }
}