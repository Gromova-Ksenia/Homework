public class Task7 {
    public static void main(String[] args) {
        int num = 2461;
        long bitNum = 0;
        bitNum += num % 2;
        num /= 2;
        while (num > 0) {
            bitNum *= 10;
            bitNum += num % 2;
            num /= 2;
        }
        System.out.print(bitNum);
    }
}
