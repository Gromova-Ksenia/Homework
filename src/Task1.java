public class Task1 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        while (a + b < 10000000) {
            b = b + a;
            a = b - a;
            System.out.print(b + " ");
        }
    }
}
