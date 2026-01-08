package basicmaths;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = -123;
        int m = reverseNumber(n);
        System.out.println("Number: " + n + "\nReversed Number: " + m);
    }

    public static int reverseNumber(int n) {
        boolean positive;
        if (n < 0)
            positive = false;
        else
            positive = true;
        n = Math.abs(n);

        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        if (positive)
            return rev;
        else
            return -rev;
    }
}