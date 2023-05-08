import java.util.Scanner;

public class tlg1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int vet[] = new int[5];

        System.out.println("Digite 5 números: ");

        for (int i = 0; i < 5; i++) {

            System.out.println((i + 1) + "°: ");
            vet[i] = s.nextInt();

        }

        System.out.println("Os números digitados foram: ");

        for (int i = 0; i < 5; i++) {

            System.out.printf("%d ", vet[i]);

        }
    }
}
