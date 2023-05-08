import java.util.Scanner;
import java.util.Arrays;

public class tlg7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int vet[] = new int[5];
        int m = 1;

        System.out.println("Digite 5 números: ");

        for (int i = 0; i < 5; i++) {

            System.out.println((i + 1) + "°: ");
            vet[i] = s.nextInt();

            m *= vet[i];

        }

        System.out.println("A soma dos números digitados é de: " + Arrays.stream(vet).sum());
        System.out.println("A multiplicação dos números digitados é de: " + m);

    }
}
