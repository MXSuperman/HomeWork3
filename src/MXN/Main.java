package MXN;

public class Main {

    public static void main(String[] args) {

        int y = 0;
        while (y < 10) {
            y++;
            System.out.println(y);
        }
        int i = 10;
        for (i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        for (int x = 1; x < 31; x = x + 7) {
            System.out.println("Сегодня пятница " + x + " -е число"); }
            for (int j = 1896; j < 2122; j = j + 79) {
                System.out.println("Пролёт кометы " + j);
        }
        for (int year = 1822; year <= 2122; year = year + 79) {
            System.out.println("dates " + year);
        }
    }
}