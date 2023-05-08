import java.util.Scanner;

public class tlg5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int vetn[] = new int[20];
        int vetp[] = new int[20];
        int veti[] = new int[20];
        int x;

        System.out.println("Digite 20 números inteiros: ");

        for (int i = 0; i < 20; i++) {

            System.out.println((i + 1) + "°: ");
            x = s.nextInt();

            vetn[i] = x;

            if (x%2 == 0) {

                vetp[i] = x;

            } else {

                veti[i] = x;

            }

        }

        System.out.println("\nO vetor com todos os números é: ");

        for (int i = 0; i < 20; i++) {

            System.out.printf("%d ", vetn[i]);

        }

        System.out.println("\nO vetor com os números pares é: ");

        for (int i = 0; i < 20; i++) {

            if (vetp[i] != 0) {

                System.out.printf("%d ", vetp[i]);

            }

        }

        System.out.println("\nO vetor com os números ímpares é: ");

        for (int i = 0; i < 20; i++) {

            if (veti[i] != 0) {

                System.out.printf("%d ", veti[i]);

            }

        }

    }
}
