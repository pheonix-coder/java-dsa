package basicmaths;

public class GCD {
    public static void main(String[] args) {
        int a = 9, b = 12;
        int gcd = computeGCD(a, b);
        System.out.println("GCD of " + a + " , " + b + " = " + gcd);
    }

    public static int computeGCD(int a, int b) {
        // iterative - brute force
        // int n = 2, min = Math.min(a, b);
        // while (n <= min) {
        // if (a % n == 0 && b % n == 0)
        // return n;
        // n++;
        // }
        // return 1;

        // recursive - optimal (euclidean)
        if (b == 0)
            return a;
        if (a == 0)
            return b;
        if (b > a)
            return computeGCD(b, a);

        return computeGCD(a % b, b);
    }
}