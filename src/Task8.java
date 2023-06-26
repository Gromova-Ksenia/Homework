public class Task8 {
    public static void main(String[] args) {
        for (int i = 0; i <= 23; i++) {
            int minutes = i % 10 * 10 + (i / 10) % 10;
            if (minutes <= 59) {
                System.out.printf("%02d:%02d", i, minutes);
                System.out.print('\n');
            }
        }
    }
}
