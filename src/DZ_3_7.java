import java.util.Scanner;
public class DZ_3_7 {
        //((Финансовое приложение: денежные единицы) Измените листинг 2.10, ComputeChange
        //.java, чтобы отображать только ненулевые номиналы, используя слова единственного числа для отдельных
        //единиц, таких как 1 доллар и 1 пенни, и слова множественного числа для нескольких единиц, таких
        //как 2 доллара и 3 пенни.
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Получите сумму
            System.out.print("Введите сумму в двойном размере, например 11,56: ");
            double amount = input.nextDouble();

            int remainingAmount = (int)(amount * 100);

            // Найдите количество в один доллар
            int numberOfDollars = remainingAmount / 100;
            remainingAmount %= 100;

            // Найдите количество четвертаков в оставшейся сумме
            int numberOfQuarters = remainingAmount / 25;
            remainingAmount %= 25;

            // Найдите количество раз в оставшемся количестве
            int numberOfDimes = remainingAmount / 10;
            remainingAmount %= 10;

            // Найдите количество никелей в оставшейся сумме
            int numberOfNickels = remainingAmount / 5;
            remainingAmount %= 5;

            // Найдите количество пенни в оставшейся сумме
            int numberOfPennies = remainingAmount;

            // Отображение результатов
            System.out.println("Ваша сумма " + amount + " состоит из");
            System.out.println(" " + numberOfDollars +
                    (numberOfDollars == 1 ? " доллар" : " долларов"));
            System.out.println(" " + numberOfQuarters +
                    (numberOfQuarters == 1 ? " четвертак" : " четвертаков"));
            System.out.println(" " + numberOfDimes +
                    (numberOfDimes == 1 ? " десятицентовик" : " десятицентовики"));
            System.out.println(" " + numberOfNickels +
                    (numberOfNickels == 1 ? " пятак" : " пятаки"));
            System.out.println(" " + numberOfPennies +
                    (numberOfPennies == 1 ? " пенни" : " пенсы"));
        }
    }

