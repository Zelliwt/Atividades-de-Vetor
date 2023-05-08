import java.util.Arrays;
import java.util.Scanner;

public class tlg12 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int idade[] = new int[30];
        int altura[] = new int[30];
        int m = 0, n = 0;

        System.out.println("Digite a idade dos alunos: ");

        for (int i = 0; i < 30; i++) {

            System.out.println((i + 1) + "ª: ");
            idade[i] = s.nextInt();

        }

        System.out.println("Digite a altura dos alunos: ");

        for (int i = 0; i < 30; i++) {

            System.out.println((i + 1) + "ª: ");
            altura[i] = s.nextInt();

        }

        m = Arrays.stream(altura).sum()/30;

        for (int i = 0; i < 30; i++) {

            if (idade[i] < 13 || altura[i] < m) {

                n++;

            }

        }

        System.out.println("A quantidade de alunos com menos de 13 anos e que têm a altura abaixo da média é de: " + n);

    }
}
