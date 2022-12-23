public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1-2");
        byte days = 67;
        System.out.println("Значение переменной days c типом byte равно " + days);
        int comments = 27897;
        System.out.println("Значение переменной comments c типом int равно " + comments);
        short backlog = -159;
        System.out.println("Значение переменной backlog c типом short равно " + backlog);
        short kilometers = 569;
        System.out.println("Значение переменной kilometers c типом short равно " + kilometers);
        long particles = 987678965549L;
        System.out.println("Значение переменной particles c типом long равно " + particles);
        float corpuscles = 27.12f;
        System.out.println("Значение переменной corpuscles c типом float равно " + corpuscles);
        double difference = 2.786;
        System.out.println("Значение переменной difference c типом double равно " + difference);
    }
    public static void task2() {
        System.out.println("Задача 3");
        byte students1 = 23;
        byte students2 = 27;
        byte students3 = 30;
        int papersForEach = 480 / (students1 + students2 + students3);
        System.out.println("На каждого ученика рассчитано " + papersForEach + " листов бумаги");
    }
    public static void task3() {
        System.out.println("Задача 4");
        byte bottlesIn2Minutes = 16;
        int bottlesIn1Minute = bottlesIn2Minutes / 2;
        System.out.println(bottlesIn1Minute);
        int bottlesIn20Minutes = 20 * bottlesIn1Minute;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        int bottlesIn1Day = 24 * 60 * bottlesIn1Minute;
        System.out.println("За сутки машина произвела " + bottlesIn1Day + " штук бутылок");
        int bottlesIn3Days = bottlesIn1Day * 3;
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        int bottlesFor1Month = bottlesIn1Day * 30;
        System.out.println("За 1 месяц машина произвела " + bottlesFor1Month + " штук бутылок");
    }
    public static void task4() {
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte whitePaintCans = 2;
        byte brownPaintCans = 4;
        int cansFor1Room = whitePaintCans + brownPaintCans;
        System.out.println(cansFor1Room);
        int totalRooms = totalCans / cansFor1Room;
        System.out.println(totalRooms);
        int totalWhitePaintCans = totalRooms * whitePaintCans;
        System.out.println(totalWhitePaintCans);
        int totalBrownPaintCans = totalRooms * brownPaintCans;
        System.out.println(totalBrownPaintCans);
        System.out.println("В школе, где " + totalRooms + " классов, нужно " + totalWhitePaintCans + " банок белой краски и " + totalBrownPaintCans + " банок коричневой краски");
    }
    public static void task5() {
        System.out.println("Задача 6");
        short totalBananas = 5 * 80;
        System.out.println(totalBananas);
        short totalMilk = 105 * 2;
        System.out.println(totalMilk);
        short totalIceCream = 100 * 2;
        System.out.println(totalIceCream);
        short totalEggs = 70 * 4;
        System.out.println(totalEggs);
        int total = totalBananas + totalMilk + totalIceCream + totalEggs;
        System.out.println(total);
        float total1 = total / 1000f;
        System.out.println(total1);
    }
    public static void task6() {
        System.out.println("Задача 7");
        short result = 7 * 1000;
        System.out.println(result);
        int days1 = result / 250;
        System.out.println(days1);
        int days2 = result / 500;
        System.out.println(days2);
        int medium = (days1 + days2) / 2;
        System.out.println(medium);
    }
    public static void task7() {
        System.out.println("Задача 8");
        int mashasSalary = 67760;
        int mashasPromotion = mashasSalary * 10 / 100;
        System.out.println(mashasPromotion);
        int totalMashasSalary = mashasSalary + mashasPromotion;
        System.out.println(totalMashasSalary);
        int mashasAnnualIncome1 = mashasSalary * 12;
        System.out.println(mashasAnnualIncome1);
        int mashasAnnualIncome2 = totalMashasSalary * 12;
        System.out.println(mashasAnnualIncome2);
        int mashasIncomeDifference = mashasAnnualIncome2 - mashasAnnualIncome1;
        System.out.println(mashasIncomeDifference);
        System.out.println("Маша теперь получает " + totalMashasSalary + " рублей. Годовой доход вырос на " + mashasIncomeDifference + " рублей.");

        int denisSalary = 83690;
        int denisPromotion = denisSalary * 10 / 100;
        System.out.println(denisPromotion);
        int totalDenisSalary = denisSalary + denisPromotion;
        System.out.println(totalDenisSalary);
        int denisAnnualIncome1 = denisSalary * 12;
        System.out.println(denisAnnualIncome1);
        int denisAnnualIncome2 = totalDenisSalary * 12;
        System.out.println(denisAnnualIncome2);
        int denisDifference = denisPromotion * 12;
        System.out.println(denisDifference);
        System.out.println("Денис теперь получает " + totalDenisSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей.");

        int kristinasSalary = 76230;
        int kristinasPromotion = kristinasSalary * 10 / 100;
        System.out.println(kristinasPromotion);
        int totalKristinasSalary = kristinasSalary + kristinasPromotion;
        System.out.println(totalKristinasSalary);
        int kristinasAnnualIncome1 = kristinasSalary * 12;
        System.out.println(kristinasAnnualIncome1);
        int kristinasAnnualIncome2 = totalKristinasSalary * 12;
        System.out.println(kristinasAnnualIncome2);
        int kristinasDifference = kristinasAnnualIncome2 - kristinasAnnualIncome1;
        System.out.println(kristinasDifference);
        System.out.println("Кристина теперь получает " + totalKristinasSalary + " рублей. Годовой доход вырос на " + kristinasDifference + " рублей.");

    }
}