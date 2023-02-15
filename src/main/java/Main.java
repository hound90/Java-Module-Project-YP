// dev branch for Y.Practicum
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int divisionAmount;
        float count;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Разделите счет на несколько человек, \nна сколько будем делить?.");


        while (true) {
            while(!scanner.hasNextInt() || !scanner.hasNextFloat()) {
                System.out.println("Неправильно. Только целое число.");
                scanner.next();
            }

            divisionAmount = scanner.nextInt();

            if (divisionAmount > 1) {
                System.out.println("Начинаем считать!");
                break;
            } else if (divisionAmount == 1) {
                System.out.println("В таком случае, сами все и оплачивайте!");
                break;
            } else {
                System.out.println("Сколько - сколько?!");
            }

        }

        Calculate calc = new Calculate();
        calc.calculate();

        count = calc.countPrice / divisionAmount;

        int bCount;

        String rubble = null;
        bCount = (int) count;
        int money;
        if (bCount % 100 > 9 && bCount % 100 < 21) {
            money = 8;
        } else {
            money = bCount % 10;
        }

        switch (money) {
            case 1:
                rubble = "рубль";
                break;
            case 2:
            case 3:
            case 4:
                rubble = "рубля";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                rubble = "рублей";
                break;


        }
        System.out.println("Добавленные товары:" +
                calc.countName + "\nСумма с человека: " +
                String.format("%.2f", count) + " " + rubble + ".");

    }
}

