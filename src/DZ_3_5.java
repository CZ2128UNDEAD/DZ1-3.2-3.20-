import java.util.Scanner;
public class DZ_3_5 {
    //(Найдите будущие даты) Напишите программу, которая предложит пользователю ввести целое число для
    //сегодняшнего дня недели (воскресенье равно 0, понедельник равен 1, ..., а суббота равна 6). Также
    //предложите пользователю ввести количество дней после сегодняшнего дня для будущего дня и отобразить
    //будущий день недели.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Предлогаем пользователю ввести целое число для сегодняшнего дня недели
        System.out.print("Enter today’s day: ");
        int day = input.nextInt();

        // Предлогаем пользователю ввести количество дней после сегодняшнего дня
        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();

        // Рассчитать будущий день
        int futureDay = (day + daysElapsed) % 7;

        System.out.print("Today is ");
        switch (day)
        {
            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday");
        }

        System.out.print(" and the future day is ");
        switch (futureDay)
        {
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday");
        }
    }
}
