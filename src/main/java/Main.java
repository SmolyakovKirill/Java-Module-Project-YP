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
            Product product = new Product();

            System.out.println("Введите название товара: ");
            String productName = scanner.nextLine();

            if(productName.equalsIgnoreCase("Завершить"))
                break;

            System.out.println("Введите цену товара(в формате рубли.копейки): ");
            Float price = scanner.nextFloat();

            product.setName(productName);
            product.setPrice(price);

            calculator.addProduct(product);
        }

        System.out.println("Добавленные товары:");
        calculator.printAllProducts();
        System.out.println(calculator.getFinalPrice()/members);
    }

}