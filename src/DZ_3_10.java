import java.util.Scanner;
public class DZ_3_10 {
    //(Игра: тест на зависимость) Листинг 3.3, SubtractionQuiz.java , случайным образом генерирует
    //вопрос о вычитании. Измените программу, чтобы случайным образом генерировать вопрос о сложении
    //с двумя целыми числами меньше 100.
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);

        // Генерируем два целых числа меньше 100
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        // Предлогаем пользователю ввести ответ
        System.out.print(
                "Сколь будет " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        // Выводим результат
        if (number1 + number2 == answer)
            System.out.println("Ты прав!");
        else
            System.out.println("Ты не прав " + number1 + " + " + number2
                    + " должно быть" + (number1 + number2));
    }
}

