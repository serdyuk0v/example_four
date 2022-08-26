public class Main {
    public static void main(String[] args) {
        int dayX = 3;
        int month = 31;
        while (dayX < month) {
            System.out.println("Сегодня пятница, " + dayX + "-е число. Необходимо подготовить отчёт.");
            dayX = dayX + 7;
        }
    }
}