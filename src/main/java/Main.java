import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int members = 0;

        while (true){
            System.out.println("На скольких человек необходимо разделить счет?:");

            Scanner scanner = new Scanner(System.in);
            try {
                members = scanner.nextInt();
            }
            catch (Exception ex){
                System.out.println("Необходимо ввести целочисленную переменнную");
                continue;
            }
            if(members <= 1) {
                System.out.println("Ошибка");
                continue;
            }
            break;
        }

        Calculator calculator = new Calculator();

        while (true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите название товара: ");
            String product = scanner.nextLine();

            if(product.equalsIgnoreCase("Завершить"))
                break;

            System.out.println("Введите цену товара(в формате рубли.копейки): ");
            Float price = scanner.nextFloat();

            calculator.addProduct(product, price);
        }

        System.out.println(calculator.getProducts());
        System.out.println(calculator.getFinalPrice());
    }
}