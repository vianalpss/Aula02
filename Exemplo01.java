import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        Double media;

        System.out.println("Digite o nome do aluno: ");
        nome = scanner.nextLine();

        System.out.println("Digite a média do aluno: ");
        media = scanner.nextDouble();

        if (media >= 7) {
            System.out.println(nome + " Aprovado");
        }else {
            System.out.println(nome + " Reprovado");
        }
        scanner.close();
    }

}
