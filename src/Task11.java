public class Task11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.print("hiss ");
                } else {
                    System.out.print("fizz ");
                }
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
