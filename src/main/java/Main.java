import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int members = 0;

        try {
            members = scanner.nextInt();
        }

        catch (Exception ex){
            System.out.println("Необходимо ввести целочисленную переменнную");
            return;
        }
        if(members <= 1) {
            System.out.println("Ошибка");
            return;
        }

        System.out.println(members);
    }
}