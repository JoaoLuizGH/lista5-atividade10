import java.util.Random;
import java.util.Scanner;

public class App {
    static Scanner tc = new Scanner(System.in);
    static Random dado = new Random();
    static int dado1, dado2;
    static int resultado;

    public static void main(String[] args) throws Exception {


        System.out.print("\nPARA JOGAR DIGITE 1, PARA SAIR DIGITE 2: ");

        int entrada = tc.nextInt();

        if (entrada == 1) {

            dado1 = dado.nextInt(6) + 1;
            dado2 = dado.nextInt(6) + 1;

            resultado = dado1 + dado2;

            System.out.println("\nDado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);

            resolver(resultado);

        } else {
            System.out.println("FIM!");
        }
    }

    public static void resolver(int resultado) {
        if (resultado == 7 || resultado == 11) {
            System.out.println("O Resultado foi: " + resultado + "\n\nNATURAL. VOCE VENCEU!");
        } else if (resultado == 2 || resultado == 3 || resultado == 12) {
            System.out.println("O Resultado foi: " + resultado + "\n\nCRAPS. VOCE PERDEU! Tente outra vez..");
        } else {
            // resultado = 4
            System.out.println("O Resultado foi: " + resultado + "\n\nJogue até conseguir o resultado '" + resultado
                    + "' novamente! (Caso tire o resultado 7 você perde!)");

            int loop = 1;

            while (loop != 2) {

                System.out
                        .print("\nPARA JOGAR DIGITE 1, PARA SAIR DIGITE 2: ");
                int entrada = tc.nextInt();

                if (entrada == 1) {
                    dado1 = dado.nextInt(6) + 1;
                    dado2 = dado.nextInt(6) + 1;

                    int resultado2 = dado1 + dado2;

                    if (resultado2 == 7) {
                        System.out.println("\nDado 1: " + dado1 + "\nDado 2: " + dado2
                                + "\nOps. Resultado '7'. Você PERDEU!");
                        loop = 2;
                    } else if (resultado2 == resultado) {
                        System.out.println("\nDado 1: " + dado1 + "\nDado 2: " + dado2
                                + "\nParabéns! Você tirou o mesmo número '" + resultado2 + "' e GANHOU!");
                        loop = 2;
                    } else {
                        System.out.println("\nDado 1: " + dado1 + "\nDado 2: " + dado2 + "\nResultado: '"
                                + resultado2 + "'. Você precisa do resultado '" + resultado + "' Jogue novamente!");
                    }
                } else {
                    System.out.println("\nFIM!");
                    loop = 2;
                }
            }
        }
    }
}