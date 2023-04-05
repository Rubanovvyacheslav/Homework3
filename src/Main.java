public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 125;
        short b = 25000;
        int c = 1755615;
        long d = 3000000;
        float e = 1.5f;
        double f = 3.54261598315;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int allClass = class1 + class2 + class3;
        int pages = 480 / allClass;
        System.out.println("На каждого ученика рассчитано " + pages + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte productivity = 16;
        byte minute = 2;
        int prodInMinute = productivity / minute;
        int prodIn20Minute = prodInMinute * 20;
        int prodInDay = prodInMinute * 60 * 24;
        int prodIn3Day = prodInDay * 3;
        int prodInMonth = prodInDay * 31;
        System.out.println("За 20 минут машина произвела " + prodIn20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + prodInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + prodIn3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + prodInMonth + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte jar = 120;
        byte whiteJarClass = 2;
        byte brownJarClass = 4;
        int sumClass = jar / (whiteJarClass + brownJarClass);
        int whiteJarAll = sumClass * whiteJarClass;
        int brownJarAll = sumClass * brownJarClass;
        System.out.println("В школе где " + sumClass + " классов, нужно " + whiteJarAll + " банок белой краски и " + brownJarAll + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int recipeGram = 5 * banana + 2 * milk + 2 * iceCream + 4 * egg;
        float recipeKg = recipeGram / 1000f;
        System.out.println("Вес спортзавтрака составляет " + recipeGram + " грамм");
        System.out.println("Вес спортзавтрака составляет " + recipeKg + " кг");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        byte weightLeft = 7;
        float weightDayLeft1 = 0.25f;
        float weightDayLeft2 = 0.5f;
        float dietDay1 = weightLeft / weightDayLeft1;
        float dietDay2 = weightLeft / weightDayLeft2;
        float dietDayMean = (dietDay1 + dietDay2) / 2;
        System.out.println("Если спортсмен каждый день будет терять " + weightDayLeft1 + " кг, то на похудение уйдет " + dietDay1 + " дней");
        System.out.println("Если спортсмен каждый день будет терять " + weightDayLeft2 + " кг, то на похудение уйдет " + dietDay2 + " дней");
        System.out.println("В среднем на похудение уйдет " + dietDayMean + " дней");
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaSalaryYear = mashaSalary * 12;
        float mashaSalaryYearIncrease = mashaSalaryYear * 1.1f;
        float mashaSalaryYearDif = mashaSalaryYearIncrease - mashaSalaryYear;
        int denisSalaryYear = denisSalary * 12;
        float denisSalaryYearIncrease = denisSalaryYear * 1.1f;
        float denisSalaryYearDif = denisSalaryYearIncrease - denisSalaryYear;
        int kristinaSalaryYear = kristinaSalary * 12;
        float kristinaSalaryYearIncrease = kristinaSalaryYear * 1.1f;
        float kristinaSlalaryYearDif = kristinaSalaryYearIncrease - kristinaSalaryYear;
        System.out.println("Маша теперь получает " + mashaSalaryYearIncrease / 12 + " рублей. Годовой доход вырос на " + mashaSalaryYearDif + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryYearIncrease / 12 + " рублей. Годовой доход вырос на " + denisSalaryYearDif + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryYearIncrease / 12 + " рублей. Годовой доход вырос на " + kristinaSlalaryYearDif + " рублей");


    }
}