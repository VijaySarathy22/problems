/*Input:

n= 6

654321

54321

4321

321

21

1*/
class Main {
    public static void main(String[] args) {
      int n = 6; 
        for (int i = n; i >= 1; i--) { 
            for (int j = i; j >= 1; j--) { 
                System.out.print(j);
            }
            System.out.println(" "); 
        }
    }
}