public class Formatter {
    public void getRightEnding(float price) {
        int value = Math.round(price);
        int valueLength = String.valueOf(value).length();

        switch (value % (10 * valueLength)){
            case 0:
                System.out.printf("Цена на каждого: %.2f рублей\n", price);
                break;
            case 1:
                switch (value % (100 * valueLength)){
                    case 11:                                                                        //exception for number 11
                        System.out.printf("Цена на каждого: %.2f рублей\n", price);
                        return;
                    default:
                        System.out.printf("Цена на каждого: %.2f рубль\n", price);
                        return;
                }
            case 2, 3, 4:
                switch (value % (100 * valueLength)){
                    case 12, 13, 14:                                                                //exception for number 12, 13, 14
                        System.out.printf("Цена на каждого: %.2f рублей\n", price);
                        return;
                    default:
                        System.out.printf("Цена на каждого: %.2f рубля\n", price);
                        return;
                }
            default:
                System.out.printf("Цена на каждого: %.2f рублей\n", price);
        }
    }
}
