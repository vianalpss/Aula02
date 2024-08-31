import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Aluno aluno01 = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno01.nome = scanner.nextLine();

        System.out.println("Digite a média do aluno: ");
        aluno01.media = scanner.nextDouble();

        aluno01.verificarAprovacao();

        scanner.close();
    }

}
