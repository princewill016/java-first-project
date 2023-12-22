import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("what is your name??");
            String userName = scanner.nextLine();
            System.out.println("welcome " + userName);
            System.out.println("How old are you??");
            int userAge = scanner.nextInt();
            System.out.println("you are " + userAge + " years old!");
        }
    }


}