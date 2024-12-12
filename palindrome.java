//paindrome of a num
//input 121
class Main {
    public static void main(String[] args) {
        int n = 523425;
        int X = n;
        int sum = 0;
        while (n > 0) {
            sum = sum * 10 + (n % 10); // Removed the misplaced semicolon
            n = n / 10;
        }
        if (sum == X) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}