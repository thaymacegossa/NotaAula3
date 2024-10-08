import java.time.LocalDate;
import java.time.Period;

public class Gerente extends Funcionario {
    private String projeto;

    public Gerente(String nome, LocalDate nasc, double salario, String projeto) {
        super(nome, nasc, salario);
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.println("Gerente " + nome + " está gerenciando o projeto: " + projeto);
    }

    public String getProjeto() {
        return projeto;
    }
}
