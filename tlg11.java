import java.util.Arrays;
import java.util.Scanner;

public class tlg11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int vet1[] = new int[10];
        int vet2[] = new int[10];
        int vet3[] = new int[10];
        int vett[] = new int[30];
        int c = 0;

        System.out.println("Digite 10 números: ");

        for (int i = 0; i < 10; i++) {

            System.out.println((i + 1) + "°: ");
            vet1[i] = s.nextInt();

        }

        System.out.println("Digite mais 10 números: ");

        for (int i = 0; i < 10; i++) {

            System.out.println((i + 1) + "°: ");
            vet2[i] = s.nextInt();

        }

        System.out.println("Digite mais 10 números: ");

        for (int i = 0; i < 10; i++) {

            System.out.println((i + 1) + "°: ");
            vet3[i] = s.nextInt();

        }

        for (int i = 0; i < 10; i++) {

            vett[i + c] = vet1[i];
            c++;
            vett[i + c] = vet2[i];
            c++;
            vett[i + c] = vet3[i];

        }

        System.out.println("Os números digitados, apresentados de maneira intercalada são: ");
        System.out.println(Arrays.toString(vett));

    }
}
