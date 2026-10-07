import aprovacao.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setFrequencia(10);
        System.out.println("Frequência: " + aluno.getFrequencia());
    }
}
