import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenue sur cette calculatrice!");
      
        powerFunction();
      
      // MULTIPLICATION
        int nombre1 = demanderNombre("Entrez le premier nombre : ");
        int nombre2 = demanderNombre("Entrez le deuxième nombre : ");

        int resultat = multiplier(nombre1, nombre2);

        System.out.println("Le résultat de la multiplication est : " + resultat);
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
  
    public static int demanderNombre(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        int nombre = scanner.nextInt();
        return nombre;

    }

    public static int multiplier(int nombre1, int nombre2) {
        return nombre1 * nombre2;
        
    }
    public static int addition (int a, int b){
        return (a + b);
    }
  
    public static int soustraction (int a, int b) {

        return a - b;
    }

}
