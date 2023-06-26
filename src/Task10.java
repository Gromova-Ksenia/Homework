public class Task10 {
    public static void main(String[] args) {
        int num = 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19;
        int finalNum = num;
        boolean findNum = false;
        while (!findNum) {
            finalNum += num;
            boolean find = false;
            for (int i = 1; i <= 20; i++) {
                if (finalNum % i != 0) {
                    find = true;
                    break;
                }
            }
            if (!find) findNum = true;
        }
        System.out.println(finalNum);
        //System.out.print(finalNum/num);
    }
}
//232792560