//reverse a number
class Main {
    public static void main(String[] args) {
        int n = 523425;
        for (int i=0; i<=n;i++){
            int last=n%10;
            System.out.println(last);
            n=n/10;
            }
           
    }
}
