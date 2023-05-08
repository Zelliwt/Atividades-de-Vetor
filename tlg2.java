import java.util.Scanner;

public class tlg2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int vet[] = new int[10];
        int x = 9;

        System.out.println("Digite 10 números: ");

        for (int i = 0; i < 10; i++) {

            System.out.println((i + 1) + "°: ");
            vet[i] = s.nextInt();

        }

        System.out.println("Os números digitados em ordem decrescente são: ");

        while (x > -1) {

            System.out.printf("%d ", vet[x]);

            x--;

        }

    }
}
