import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int members = 0;
        Calculator calculator = new Calculator();
        Product product = new Product();
        Formatter formatter = new Formatter();

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

        while (true){
            Scanner scanner = new Scanner(System.in);
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
        formatter.getRightEnding(calculator.getFinalPrice()/members);
    }

}