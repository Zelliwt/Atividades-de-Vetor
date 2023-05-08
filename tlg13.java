import java.util.Scanner;

public class tlg13 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        float vet[] = new float[12];
        float m = 0;
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.println("Digite a temperatura média de cada mês do ano: ");

        for (int i = 0; i < 12; i++) {

            System.out.printf("%s: ", meses[i]);
            vet[i] = s.nextFloat();

            m += vet[i];

        }

        m = m/12;

        for (int i = 0; i < 12; i++) {

            if (vet[i] > m) {

                System.out.printf("\nO mês de %s teve uma temperatura média de: %.2f°C, acima da média anual, de: %.2f°C", meses[i], vet[i], m);

            }

        }

    }
}
