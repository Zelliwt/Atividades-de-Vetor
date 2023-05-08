import java.util.Scanner;

public class tlg4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        char vet[] = new char[10];

        System.out.println("Digite 10 letras: ");

        for (int i = 0; i < 10; i++) {

            System.out.println((i + 1) + "ª: ");
            vet[i] = s.next().charAt(0);

        }

        System.out.println("As consoantes digitadas foram: ");

        for (int i = 0; i < 10; i++) {

            if (vet[i] == 'a' || vet[i] == 'e' || vet[i] == 'i' || vet[i] == 'o' || vet[i] == 'u') {

                System.out.println(vet[i]);

            }

        }

    }
}
