import java.util.Scanner;

public class tlg3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        float vet[] = new float[4];
        float m = 0;

        System.out.println("Digite as notas do aluno: ");

        for (int i = 0; i < 4; i++) {

            System.out.println((i + 1) + "ª: ");
            vet[i] = s.nextFloat();

            m += vet[i];

        }

        System.out.println("As notas do aluno foram: ");

        for (int i = 0; i < 4; i++) {

            System.out.printf("%.3f ", vet[i]);

        }

        System.out.println("A média do aluno foi de: " + m/4);

    }
}
