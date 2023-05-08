import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tlg14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        int respostasPositivas = 0;
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = input.nextLine().toLowerCase();
            if (resposta.equals("sim")) {
                respostasPositivas++;
            }
        }

        if (respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}