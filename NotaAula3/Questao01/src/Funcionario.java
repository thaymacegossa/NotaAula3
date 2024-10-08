import java.time.LocalDate;
import java.time.Period;
public class Funcionario {
    protected String nome;
    protected LocalDate nasc; // Data de nascimento
    protected double salario;


    public Funcionario(String nome, LocalDate nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public void informarSalario() {
        System.out.printf("Salário de %s: R$%.2f\n", nome, salario);
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(nasc, hoje).getYears();
    }
    
    public String getNome() {
        return nome;
    }

    public LocalDate getNasc() {
        return nasc;
    }

    public double getSalario() {
        return salario;
    }
}
