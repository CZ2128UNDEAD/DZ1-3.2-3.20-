import java.util.Scanner;
public class DZ_3_15 {
    //(Игра: лотерея) Пересмотрите листинг 3.8, Lottery.java , чтобы сгенерировать лотерею из трехзначного
    //числа. Программа предлагает пользователю ввести трехзначное число и
    //определяет, выигрывает ли пользователь в соответствии со следующими правилами:
    //1. Если введенные пользователем данные совпадают с номером лотереи в точном порядке, награда составляет
    //10 000 долларов.
    //2. Если все цифры, введенные пользователем, совпадают со всеми цифрами лотерейного номера, выигрыш составляет
    //3000 долларов.
    //3. Если одна цифра, введенная пользователем, совпадает с цифрой в номере лотереи, выигрыш составляет
    //1000 долларов.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Сгенерируйте случайное трехзначное число
        int lottery = (int)(Math.random() * 1000);

        // Предложит пользователю ввести трехзначный номер
        System.out.print("Введите трехзначный номер: ");
        int guess = input.nextInt();

        // Извлечение цифр из лотереи
        // int lotteryDigit1 = lottery / 100; <= здесь предупреждение
        int remainingDigits = lottery % 100;
        int lotteryDigit2 = remainingDigits / 10;
        int lotteryDigit3 = remainingDigits % 10;

        // Извлекать цифры из догадки
        // int guessDigit1 = guess / 100; <= здесь предупреждение
       // int remainingDigits = guess % 100; <= здесь ошибка
        int guessDigit2 = remainingDigits / 10;
        int guessDigit3 = remainingDigits % 10;

        System.out.println("Номер лотерейного билета " + lottery);

        // Проверяем догадку
        if (guess == lottery)
            System.out.println("Идиальное совпадение: вы получаете $10,000");
        else if (guessDigit2 == lotteryDigit2)
        {
            System.out.println("Все цифры совпали!: вы получаете $3,000");
        }
        else if (guessDigit3 == lotteryDigit3)
        {
            System.out.println("Одна цифра совпала!: вы получаете $1,000");
            }
        else
            System.out.println("Ни одна из цифр не совпала!");
        }
    }
// Не понимаю как сделать, помогите!
