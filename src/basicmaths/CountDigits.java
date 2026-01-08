package basicmaths;

public class CountDigits {
    public static void main(String[] args) {
        int n = -9999;
        int digits = countDigits(n);
        System.out.println("Number " + n + " has " + digits + " digits.");
    }

    public static int countDigits(int n) {
        n = Math.abs(n);
        int c = 0;
        while (n != 0) {
            n /= 10;
            c++;
        }
        return c;
    }
}