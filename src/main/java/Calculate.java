import java.util.Scanner;

public class Calculate {


    String countName = "";
    float countPrice = 0;

    public void calculate() {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Введите название товара. \n" +
                    "Если не хотите добавлять, то напишите 'Завершить'.");
            String name = scanner.next();

            if (name.equalsIgnoreCase("Завершить")) {
                System.out.println("Все товары добавлены.");
                break;
            }
            countName = countName + "\n" + name;

            System.out.println("Введите стоимость товара в формате '22.29'.");
            float price = scanner.nextFloat();
            countPrice = countPrice + price;


        }
    }

}
