import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int members = 0;

        while (true){
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
        System.out.println(members);
    }
}