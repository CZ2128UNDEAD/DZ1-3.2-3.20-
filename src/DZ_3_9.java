import java.util.Scanner;
public class DZ_3_9 {
    //(Бизнес: проверьте ISBN-10) ISBN-10 (Международный стандартный номер книги)
    //состоит из 10 цифр: d1d2d3d4d5d6d7d8d9d10. Последняя цифра, d10, является контрольной суммой,
    //которая вычисляется из остальных девяти цифр по следующей формуле:
    //(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
    //d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
    //Если контрольная сумма равна 10, последняя цифра обозначается как X в соответствии с ISBN-10
    //соглашение. Напишите программу, которая предложит пользователю ввести первые 9 цифр и
    //отобразит 10-значный ISBN (включая начальные нули). Ваша программа должна читать
    //входные данные в виде целого числа. Вот примеры запусков:
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Предлогаем пользователю ввести первые 9 цифр 10-значного ISBN
        System.out.print("Введите первые 9 цифр ISBN в виде целого числа: ");
        int isbn = input.nextInt();

        // Извлекаем цифры ISBN
        int d1 = isbn / 100000000;
        int remainingDigits = isbn % 100000000;
        int d2 = remainingDigits / 10000000;
        remainingDigits %= 10000000;
        int d3 = remainingDigits / 1000000;
        remainingDigits %= 1000000;
        int d4 = remainingDigits / 100000;
        remainingDigits %= 100000;
        int d5 = remainingDigits / 10000;
        remainingDigits %= 10000;
        int d6 = remainingDigits / 1000;
        remainingDigits %= 1000;
        int d7 = remainingDigits / 100;
        remainingDigits %= 100;
        int d8 = remainingDigits / 10;
        remainingDigits %= 10;
        int d9 = remainingDigits;

        // Вычислить d10
        int d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5
                + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        // Отображаем 10-значный ISBN
        System.out.println("Номер ISBN-10 равен " + d1 + d2 + d3 + d4 + d5
                + d6 + d7 + d8 + d9);
        if (d10 == 10)
            System.out.println("X");
        else
            System.out.println(d10);
    }
}

