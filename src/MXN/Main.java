package MXN;

public class Main {

    public static void main(String[] args) {

        // Задание 1

        int y = 0;
        while (y < 10) {
            y++;
            System.out.println(y);
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        // Задание 2

        for (int x = 1; x < 31; x = x + 7) {
            System.out.println("Сегодня пятница " + x + " -е число"); }

        // Задание 3

        int currentYear = 2022;
        int fromYearStar = currentYear - 200;
        int lastYear = currentYear + 100;

        for (int i = 0; i < lastYear; i = i + 79) {
            if (i > fromYearStar && i < lastYear)
                System.out.println("Пролёт кометы " + i); }
        }
    }