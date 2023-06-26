import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        boolean[] digits = new boolean[10];
        for (int i = 10000000; i <= 99999999; i++) {
            Arrays.fill(digits, false);
            int num = i;
            boolean findCopyDigit = false;
            for (int j = 0; j < 8; j++) {
                int oneDigit = num % 10;
                if (!digits[oneDigit]) {
                    digits[oneDigit] = true;
                } else {
                    findCopyDigit = true;
                    break;
                }
                num /= 10;
            }
            if (!findCopyDigit) {
                if (i % 12345 == 0) System.out.print(i + " ");
            }
        }
    }
}
