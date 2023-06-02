public class Main {
    public static void main(String[] args) {
            double a = 10.0;
            double b = 3.0;

            double resultat = diviser(a, b);
            System.out.println("Le résultat de la division est : " + resultat);
        }

        //region DIVISEUR
        public static double diviser(double dividende, double diviseur) {
            if (diviseur == 0) {
                throw new ArithmeticException("Division par zéro !");
            }

            return dividende / diviseur;
        }
        //endregion
    }