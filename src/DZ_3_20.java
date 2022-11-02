import java.util.Scanner;
public class DZ_3_20 {
    //(Наука: температура холодного ветра) Упражнение 2.17 по программированию дает формулу
    //для вычисления температуры холодного ветра. Формула действительна для температур в
    //диапазоне от -58ºF до 41ºF и скорости ветра, большей или равной 2.
    //Напишите программу, которая предложит пользователю ввести температуру и скорость ветра.
    //Программа отображает температуру охлаждения ветра, если входные данные верны; в противном случае
    //выводится сообщение, указывающее, являются ли температура и/ или скорость ветра
    //недопустимыми.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Предложит пользователю ввести температуру и скорость ветра
        System.out.print("Введите температуру в градусах Фаренгейта " + "между -58F и 41F: ");
        double temperature = input.nextDouble();
        System.out.print("Введите скорость ветра (>= 2) в милях в час: ");
        double speed = input.nextDouble();

        if (temperature <= -58 || temperature >= 41 || speed < 2)
        {
            System.out.print("Тогда ");
            if (temperature <= -58 || temperature >= 41)
                System.out.print("температура ");
            if ((temperature <= -58 || temperature >= 41) && speed < 2)
                System.out.print("aи ");
            if (speed < 2)
                System.out.print("скорость ветра ");
            System.out.println("является недействительным");
            System.exit(1);
        }

        // Вычисляем индекс насколько холоден ветер
        double windChill = 35.74 + 0.6215 * temperature -
                35.75 * Math.pow(speed, 0.16) +
                0.4275 * temperature * Math.pow(speed, 0.16);

        // Выводим результат
        System.out.println("Индекс холода ветра равен " + windChill);
    }
}
