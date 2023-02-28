public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++ ) {
            System.out.println("Цикл " + i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Обратный цикл " + i);
        }

        for (int i = 0; i < 17; i += 2) {
            System.out.println("Четное число " + i);
        }

        for (int i = 10; i >= -10; i--) {
            System.out.println("Обратный цикл " +i);
        }

        for (int i = 1904; i <= 2096; i += 4 ) {
            System.out.println(i + " год является високосным");
        }

        for ( int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        for ( int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }


        int money = 29000;
        int month = 0;
        for( int i = 1; i <= 12; i++) {
            month += money;
            System.out.println("Mecяц " + i + "сумма накоплений равна" + month + "рублей");
        }


        int pay = 29000;
        int months = 0;
        for ( int i = 1; i <= 12; i++) {
            months = months + months / 100;
            months = months + pay;
            System.out.println("Месяц " + i + " сумма накоплений равна " +months+ " рублей");
        }
        System.out.println(months);


        int N=2;
        for (int i = 1; i <= 20; i *= 2) {
            System.out.println("2*" +i+ "=" + N*i);
        }
    }
}