public class Main {
    public static void main(String[] args) {
        int year = 0;
        while (year <= 2122) {
            if (year % 79 == 0 && year > 1822) {
                System.out.println(year + "\n");
            }
            year++;
        }
    }
}