import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros: ");

        int numeroUm = scanner.nextInt();
        int numeroDois = scanner.nextInt();

        if (numeroUm > numeroDois) {

            System.out.println("O maior número é: " + numeroUm + ".");
        }
        else if (numeroUm < numeroDois) {
            System.out.println("O maior número é: " + numeroDois + ".");
        }
        else {
            System.out.println("Os números são iguais!");
        }

    }
}