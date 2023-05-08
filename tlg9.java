import java.util.Scanner;

public class tlg9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int A[] = new int[10];
        int sq = 0;

        System.out.println("Digite 10 números: ");

        for (int i = 0; i < 10; i++) {

            System.out.println((i + 1) + "°: ");
            A[i] = s.nextInt();

            sq += (A[i] * A[i]);

        }

        System.out.println("A soma dos quadrados dos números digitados é de: " + sq);

    }
}
