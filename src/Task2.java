public class Task2 {
    public static void main(String[] args) {
        for (int n = 2; n < 1000000; n++) {
            boolean find = false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    find = true;
                    break;
                }
            }
            if (!find) System.out.print(n + " ");
        }
    }
}
