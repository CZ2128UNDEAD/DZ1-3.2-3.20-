import java.util.Scanner;
public class DZ_3_2 {
    //(Игра: сложи три числа) Программа в листинге 3.1, AdditionQuiz.java ,
    //генерирует два целых числа и предлагает пользователю ввести сумму этих двух целых чисел.
    //Измените программу, чтобы сгенерировать три однозначных целых числа, и предложите пользователю
    //ввести сумму этих трех целых чисел.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Генерируем 3 рандомных числа
        int digit1 = (int)(Math.random() * 10);
        int digit2 = (int)(Math.random() * 10);
        int digit3 = (int)(Math.random() * 10);

        // Предлагаем пользователю посчитать
        System.out.print(
                "Сколь будет " + digit1 + " + " + digit2 + " + " + digit3 + "? ");
        int answer = input.nextInt();

        System.out.println(
                digit1 + " + " + digit2 + " + " + digit3 + " = " + answer + " is " +
                        (digit1 + digit2 + digit3 == answer));
    }
}
