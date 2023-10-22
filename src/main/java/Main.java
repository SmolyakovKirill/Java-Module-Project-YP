import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int members = scanner.nextInt();

        if(members <= 1) {
            System.out.println("Ошибка");
            return;
        }

        System.out.println(members);
    }
}