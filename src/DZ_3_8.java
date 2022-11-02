import java.util.Scanner;
public class DZ_3_8 {
    //(Сортировка трех целых чисел) Напишите программу, которая предложит пользователю ввести три целых
    //числа и отобразить целые числа в порядке неубывания.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Предлогаем пользователю ввести три целых числа
        System.out.print("Введите 3 целых числа: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Сортировка чисел
        int temp;
        if (number2 < number1 || number3 < number1)
        {
            if (number2 < number1)
            {
                temp = number1;
                number1 = number2;
                number2 = temp;
            }
            if (number3 < number1)
            {
                temp = number1;
                number1 = number3;
                number3 = temp;
            }
        }
        if (number3 < number2)
        {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }

        // Делаем так что бы отображало номера в порядке возрастания
        System.out.println(number1 + " " + number2 + " " + number3);
    }
}
