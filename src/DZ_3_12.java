import java.util.Scanner;
public class DZ_3_12 {
    //(Номер палиндрома) Напишите программу, которая предлагает пользователю ввести трехзначное
    //целое число и определяет, является ли это палиндромным числом. Число является палиндромом
    //, если оно читается одинаково справа налево и слева направо.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Предлогаем пользователю ввести трехзначное целое число
        System.out.print("Введите трехзначное целое число: ");
        int number = input.nextInt();

        // Тест на палиндром
        int digit1 = (number / 100);
        int remaining = number % 100;
        int digit3 = (remaining % 10);

        // Выводим результат
        System.out.println(
                number + ((digit1 == digit3) ? " это являеться" : " это не являеться") + "palindrome");
    }
}
