import java.util.Scanner;

public class tlg8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        float peso[] = new float[5];
        float altura[] = new float[5];
        int x = 4;

        for (int i = 0; i < 5; i++) {

            System.out.printf("Peso da %dª pessoa: ", i + 1);
            peso[i] = s.nextFloat();

        }

        for (int i = 0; i < 5; i++) {

            System.out.printf("Altura da %dª pessoa: ", i + 1);
            altura[i] = s.nextFloat();

        }

        while (x > -1) {

            System.out.printf("\nO peso da %dª pessoa é de: %f", x + 1, peso[x]);
            System.out.printf("\nA altura da %dª pessoa é de: %f", x + 1, altura[x]);
            x--;

        }

    }
}
