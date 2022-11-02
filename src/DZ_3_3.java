import java.util.Scanner;
public class DZ_3_3 {
    //(Алгебра: решите 2 * 2 линейных уравнения) Линейное уравнение может быть решено с помощью
    //Правило Крамера, приведенное в упражнении по программированию 1.13. Напишите программу, которая предложит
    //пользователю ввести a, b, c, d, e и f и отобразит результат. Если ad - bc равно 0, сообщите
    //, что “Уравнение не имеет решения”.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Предложите пользователю ввести a, b, c, d, e и f.
        System.out.print("Введите значения для a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        // Решите линейное уравнение
        if (a * d - b * c == 0)
            System.out.println("Уравнение не имеет решения.");
        else
        {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);
            System.out.println("x это " + x + " и y это " + y);
        }
    }
}
