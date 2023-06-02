import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        powerFunction();
    }

    public static void powerFunction() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Donner un nombre entier qui sera élevé à sa propre puissance:");
        String input = scan.nextLine();
        if (isIntegerString(input)) {
            int inputInt = Integer.parseInt(input);
            System.out.println(input + " élevé à sa propre puissance est égal à " + Double.toString(Math.pow(inputInt, inputInt)).replaceAll(".0", "") + ".");
        } else {
            System.out.println("Vous n'avez pas entré un nombre entier, bye!");
        }
    }

    public static boolean isIntegerString(String input) {
        return input.matches("-?\\d+");
    }
}