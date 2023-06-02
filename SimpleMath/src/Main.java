import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // MULTIPLICATION
        int nombre1 = demanderNombre("Entrez le premier nombre : ");
        int nombre2 = demanderNombre("Entrez le deuxième nombre : ");

        int resultat = multiplier(nombre1, nombre2);

        System.out.println("Le résultat de la multiplication est : " + resultat);
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
}