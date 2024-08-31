public class Aluno {
    //Atributos
    String nome;
    Double media;

    //Método
    public void verificarAprovacao(){
        if (media >= 7) {
            System.out.println(nome + " Aprovado");
        }else {
            System.out.println(nome + " Reprovado");
        }
    }

}
