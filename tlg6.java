import java.util.Scanner;

public class tlg6 {

    public static void main(String[] args) {

        double medias[] = new double[10];
        double n1, n2, n3, n4, m;
        int contAlunos = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            
            System.out.println("Digite as notas do aluno " + (i+1) + ":");
            System.out.println("1ª: ");
            n1 = sc.nextDouble();
            System.out.println("2ª: ");
            n2 = sc.nextDouble();
            System.out.println("3ª: ");
            n3 = sc.nextDouble();
            System.out.println("4ª: ");
            n4 = sc.nextDouble();
            m = (n1 + n2 + n3 + n4) / 4;
            
            medias[i] = m;
            
        }

        for (int i = 0; i < 10; i++) {
            
            if (medias[i] >= 7.0) {
                
                contAlunos++;
                
            }
            
        }

        System.out.println("Número de alunos com média maior ou igual a 7.0: " + contAlunos);

    }

}
