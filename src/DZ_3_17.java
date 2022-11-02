import java.util.Scanner;
public class DZ_3_17 {
    //(Игра: ножницы, камень, бумага) Напишите программу, которая воспроизводит популярную игру "ножницы-камень-бумага
    //". (Ножницы могут разрезать бумагу, камень может ударить по ножницам, а бумага может
    //обернуть камень.) Программа случайным образом генерирует число 0, 1 или 2, представляющее
    //ножницы, камень и бумагу. Программа предложит пользователю ввести число 0, 1 или
    //2 и отобразит сообщение, указывающее, выигрывает ли пользователь или компьютер, проигрывает
    //или играет вничью.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Сгенерируйте случайное целое число 0, 1, или 2
        int computer = (int)(Math.random() * 3);

        // Предложите пользователю ввести число 0, 1 или 2
        System.out.print("ножницы (0), камень (1), бумага (2): ");
        int user = input.nextInt();

        System.out.print("Компьютер выбрал ");
        switch (computer)
        {
            case 0: System.out.print("Ножницы."); break;
            case 1: System.out.print("Камень."); break;
            case 2: System.out.print("Бумага.");
        }

        System.out.print(" Вы выбрали ");
        switch (user)
        {
            case 0: System.out.print("Ножницы."); break;
            case 1: System.out.print("Камень."); break;
            case 2: System.out.print("Бумага.");
        }

        // Выводим результат
        if (computer == user)
            System.out.println(" Вау ничья!");
        else
        {
            boolean win = (user == 0 && computer == 2) ||
                    (user == 1 && computer == 0) ||
                    (user == 2 && computer == 1);
            if (win)
                System.out.println(". Ты выйграл");
            else
                System.out.println(". Ты проиграл");
        }
    }
}
