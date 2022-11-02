import java.util.Scanner;
public class DZ_3_18 {
    //(Стоимость доставки) Транспортная компания использует следующую функцию для расчета
    //стоимости доставки (в долларах) на основе веса посылки (в
    //фунтах).
    //
    //3.5, если 0 < w < = 1
    //c(w) = 5,5, если 1 < w < = 3
    //8.5, если 3 < w < = 10
    //10.5, если 10 < w < = 20
    //Напишите программу, которая предложит пользователю ввести вес посылки и
    //отобразить стоимость доставки. Если вес превышает 50, отобразится сообщение “
    //посылка не может быть отправлена”.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Предлагаем ввести пользователю вес упаковки
        System.out.print("Введите вес упаковки: ");
        double weight = input.nextDouble();

        // Рассчитываем стоимость доставки
        if (weight > 50)
            System.out.println("Посылка не может быть отправлена.");
        else
        {
            double costPerPound;
            if (weight > 0 && weight <= 1)
                costPerPound = 3.5;
            else if (weight <= 3)
                costPerPound = 5.5;
            else if (weight <= 10)
                costPerPound = 8.5;
            else //если (вес <= 20)
                costPerPound = 10.5;
            System.out.println("Стоимость доставки посылки составляет $" +
                    costPerPound * weight);
        }
    }
}
