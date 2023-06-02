
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        GetPrenom();
    }
    public void GetPrenom(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quel est votre prénom : ");
        String chaine = scanner.next();
        System.out.print("Votre prénom est : "+chaine);
    }

}