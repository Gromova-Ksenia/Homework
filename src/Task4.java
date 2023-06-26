public class Task4 {
    public static void main(String[] args) {
        for (int n = 2; n <= 1000000; n++) {
            int numSum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) numSum += i;
            }
            if (numSum == n) System.out.print(n + " ");
        }
    }
}
