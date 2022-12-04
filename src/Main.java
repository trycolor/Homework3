public class Main {
    public static void main(String[] args) {

        int one;
        one = 1;
        byte two;
        two = 2;
        short three;
        three = 3;
        long four;
        four = 4;
        float five;
        five = 5.0f;
        double six;
        six = 6.0;
        System.out.println("Значение пременной one c типом данных int равно " + one);
        System.out.println("Значение пременной two c типом данных byte равно " + two);
        System.out.println("Значение пременной three c типом данных short равно " + three);
        System.out.println("Значение пременной four c типом данных long равно " + four);
        System.out.println("Значение пременной five c типом данных float равно " + five);
        System.out.println("Значение пременной six c типом данных double равно " + six);

        //задание 2
        double a = 27.12;
        long b = 987678965549L;
        byte c = 2;
        short d = 786;
        boolean e = false;
        short f = 569;
        short g = -159;
        short j = 27897;
        byte i = 67;
        int h = 74674;
        char k = 56;
        float r = 4.7f;

        //Упражнение 3
        short ludPetr = 23;
        short anSerg = 27;
        short ekatAndr = 30;
        int vsegolistov = 480;
        int sum = ludPetr + anSerg + ekatAndr;
        int listovUcheniku = vsegolistov / sum;
        System.out.println("На каждого ученика рассчитано " + listovUcheniku + " листов бумаги");

        //упражнение 4
        double efficiency = 16 / 2;

        System.out.println("За 20 минут машина произвела бутылок " + efficiency *20 + " штук");
        System.out.println("За сутки машина произвела бутылок " + efficiency*60*24 + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + efficiency*60*24*3 + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + efficiency*60*24*30 + " штук");


    }
}