public class Task12 {
    public static void main(String[] args) {
        double x = 13;
        double y = 45;
        int day = 1;
        while (x < y) {
            day++;
            x *= 1.1;
            System.out.println("В день номер " + day + " спортсмен пробежал " + x);
        }
        System.out.print(day);
    }
}
