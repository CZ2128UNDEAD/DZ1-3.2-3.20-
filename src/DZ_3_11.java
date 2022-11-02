import java.util.Scanner;
public class DZ_3_11 {
    //(Найдите количество дней в месяце) Напишите программу, которая предложит пользователю
    //ввести месяц и год и отобразит количество дней в месяце.
    //Например, если пользователь ввел месяц 2 и 2012 год, программа должна отобразить
    //, что в феврале 2012 года было 29 дней. Если пользователь ввел 3 месяц и 2015 год,
    //программа должна отобразить, что в марте 2015 года был 31 день.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Предлогаем пользователю ввести месяц и год
        System.out.print("Введите месяц как целое число: ");
        int month = input.nextInt();
        System.out.print("Введите год в виде целого числа: ");
        int year = input.nextInt();

        boolean leapYear =
                (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        // Отображение количества дней в месяце
        switch (month)
        {
            case 1: System.out.println(
                    "Январь " + year + " был 31 день"); break;
            case 2: System.out.println("Февраль " + year + " был" +
                    ((leapYear) ? " 29 дней" : " 28 дней")); break;
            case 3: System.out.println(
                    "Март " + year + " был 31 день"); break;
            case 4: System.out.println(
                    "Апрель " + year + " было 30 дней"); break;
            case 5: System.out.println(
                    "Май " + year + " был 31 день"); break;
            case 6: System.out.println(
                    "Июнь " + year + " было 30 дней"); break;
            case 7: System.out.println(
                    "Июль " + year + " был 31 день"); break;
            case 8: System.out.println(
                    "Август " + year + " был 31 день"); break;
            case 9: System.out.println(
                    "Сентябрь " + year + " было 30 дней"); break;
            case 10: System.out.println(
                    "Октябрь " + year + " был 31 день"); break;
            case 11: System.out.println(
                    "Ноябрь " + year + " было 30 дней"); break;
            case 12: System.out.println(
                    "Декабрь " + year + " был 31 день");
        }
    }
}
