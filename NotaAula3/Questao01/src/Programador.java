import java.time.LocalDate;
import java.time.Period;

public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, LocalDate nasc, double salario, String linguagem) {
        super(nome, nasc, salario);
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.println("Programador " + nome + " trabalha com a linguagem: " + linguagem);
    }

    public String getLinguagem() {
        return linguagem;
    }
}

