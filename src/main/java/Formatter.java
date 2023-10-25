public class Formatter {
    public void getRightEnding(float price) {
        int value = Math.round(price);
        int valueLength = String.valueOf(value).length();

        switch (value % (10 * valueLength)){
            case 1:
                System.out.printf("Цена на каждого: %.2f рубль\n", price);
                return;
            case 2, 3, 4:
                System.out.printf("Цена на каждого: %.2f рубля\n", price);
                return;
            default:
                System.out.printf("Цена на каждого: %.2f рублей\n", price);
        }
    }
}
