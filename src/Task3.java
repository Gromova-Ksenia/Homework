public class Task3 {
    public static void main(String[] args) {
        for (int n = 10; n <= 1000000; n++) {
            int numLenght = String.valueOf(n).length();
            int numSum = 0;
            int numCopy = n;
            for (int i = 0; i < numLenght; i++) {
                int numCut = numCopy % 10;
                numCopy /= 10;
                numSum += Math.pow(numCut, numLenght);
            }
            if (numSum == n) System.out.print(n + " ");
        }
    }
}
