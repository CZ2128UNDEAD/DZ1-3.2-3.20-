import java.util.Scanner;
public class DZ_3_19 {
    //(Вычислите периметр треугольника) Напишите программу, которая считывает три ребра
    //треугольника и вычисляет периметр, если входные данные верны. В противном случае отобразится, что
    //ввод неверен. Входные данные действительны, если сумма каждой пары двух ребер
    //больше, чем оставшееся ребро.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Предлогаем пользователю ввести три ребра для треугольника
        System.out.println("Введите три ребра для треугольника:");
        System.out.print(" Ребро 1 указывает x, y: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print(" Ребро 2 указывает x, y: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print(" Ребро 3 указывает x, y: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Проверим, действительны ли входные данные
        boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
                (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
                (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);

        if (!valid)
        {
            System.out.println("Ввод неверен.");
            System.exit(1);
        }

        // Вычислите стороны треугольника
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);

        // Отобразите периметр треугольника
        System.out.println("периметр треугольника равен " + (side1 + side2 + side3));
    }
}
