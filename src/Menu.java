import java.util.Scanner;

public class Menu {

    public void mainMenu() {
        System.out.println("Menu \n" +
                "please enter command for action \n" +
                "с - create \n" +
                "r  - read \n" +
                "u  - update \n" +
                "d  - delete \n" +
                "exit - for finish program");
    }

    public String readConcoleValue() {
        String value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value;
    }
}