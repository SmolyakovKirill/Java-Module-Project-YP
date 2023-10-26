import java.util.Scanner;

public class Main {
    public static boolean isPriceReady = false;
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Formatter formatter = new Formatter();
        String productName;
        float price = 0.0f;

        int members = inputMembers();

        while (!isPriceReady) {                                                                     //ask for new product while price is not ready
            Product product = new Product();
            productName = inputProductName();

            if (!productName.equals(" ")) {
                product.setName(productName);
                price = inputPrice();
                product.setPrice(price);
                calculator.addProduct(product);
            }
        }

        System.out.println("Добавленные товары:");
        calculator.printAllProducts();
        formatter.getRightEnding(calculator.getFinalPrice()/members);
    }

    public static int inputMembers(){                                                               //method for input count of members
        int members = 0;
        while (true){
            System.out.println("На скольких человек необходимо разделить счет?:");

            Scanner scanner = new Scanner(System.in);
            try {                                                                                   //checking number for correct value
                members = scanner.nextInt();
            }
            catch (Exception ex){
                System.out.println("Необходимо ввести целочисленную переменнную :)");
                continue;
            }
            if (members <= 1) {
                System.out.println("Некорректное значение, для калькулятора необходимо, как минимум двое ;)");
                continue;
            }
            break;
        }
        return members;
    }

    public static String inputProductName(){                                                        //method for input product name
        String productName;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Введите название товара или команду \"Завершить\", если вы закончили: ");
            productName = scanner.nextLine();
            if (!isNameCorrect(productName)){
                System.out.println("Введите корректное название товара ;)");
                continue;
            }
            break;
        }


        if (productName.equalsIgnoreCase("Завершить")) {
            isPriceReady = true;
            return " ";
        }
        return productName;
    }

    public static float inputPrice(){                                                               //method for input product price
        Float price = 0.0F;
        while (true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену товара(в формате рубли.копейки): ");
        try {                                                                                       //checking price for correct value
             price = scanner.nextFloat();
        }
        catch (Exception ex){
             System.out.println("Необходимо ввести число :)");
             continue;
         }
        if (price < 0) {
            System.out.println("Некорректное значение, цена должна быть больше 0 :)");
            continue;
        }
        break;
        }
        return price;
    }

    public static boolean isNameCorrect(String productName) {                                       //method for search incorrect names with regex
        return productName.matches("[а-яА-Яa-zA-Z]+");
    }

}