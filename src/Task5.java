public class Task5 {
    public static void main(String[] args) {
        int n = 2345432;
        int numLength = String.valueOf(n).length();
        int firstHalf = n;
        int secondHalf = 0;
        for (int i = 0; i < numLength / 2; i++) {
            secondHalf = secondHalf * 10 + firstHalf % 10;
            firstHalf /= 10;
        }
        if (numLength % 2 == 1) firstHalf /= 10;
        //System.out.println("first half = " + firstHalf + '\n' + "second half = " + secondHalf);
        if (firstHalf == secondHalf) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
