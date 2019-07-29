
public class Main {
    public static void main(String[] args) {
        int[] a = { 1, 2, 4, 5, 6, 0 };
        int[] b = { 3 };
        System.out.println(tribonacci(4));
    }

    public static int tribonacci(int n) {
        if (0 == n) {
            return 0;
        }
        if (1 == n) {
            return 1;
        }
        if (2 == n) {
            return 1;
        }
        int p2 = 0;
        int p1 = 1;
        int p = 1;
        for (int i = 3; i <= n; i++) {
            p += p1 + p2;
            p1 = p - p1 - p2;
            p2 = p - p1 - p2;
        }
        return p;
    }
}