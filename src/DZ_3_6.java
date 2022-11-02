import java.util.Scanner;
public class DZ_3_6 {
    //(Приложение для здравоохранения: ИМТ) Пересмотреть листинг 3.4, ComputeAndInterpretBMI.java , чтобы
    //позволить пользователю ввести вес, футы и дюймы. Например, если рост человека составляет 5 футов и 10
    //дюймов, вы введете 5 для футов и 10 для дюймов.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Предложите пользователю ввести вес, футы и дюймы
        System.out.print("Введите вес в фунтах: ");
        double weight = input.nextDouble();
        System.out.print("Введите размер ноги : ");
        double feet = input.nextDouble();
        System.out.print("Введите дюймы: ");
        double inches = input.nextDouble();

        final double Kilograms_Per_Pound = 0.45359237; // Константа
        final double Meters_Per_Inch = 0.0254; 		  // Константа
        final double Feet_Per_Inch = 0.0833333;		  // Константа

        weight *= Kilograms_Per_Pound;
        double height = (inches += feet / Feet_Per_Inch) * Meters_Per_Inch;
        double bmi = weight / (Math.pow(height, 2));

        // Выводим результат
        System.out.println("BMI is " + bmi);// BMI - Индекс массы тела
        if (bmi < 18.5)
            System.out.println("Недостаточный вес");
        else if (bmi < 25)
            System.out.println("Нормальный вес");
        else if (bmi < 30)
            System.out.println("Избыточный вес");
        else
            System.out.println("Пора худеть! Диагноз: Ожирение");
        System.out.println(inches); // inches - жалуеться что не обьявлен, а где и почему я не понял.
    }
}

