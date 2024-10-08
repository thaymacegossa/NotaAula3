import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("João", LocalDate.of(1977, 5, 05), 10000.00, "Sistema de gerenciamento de pessoas");

        Programador programador = new Programador("Elisa", LocalDate.of(1979, 7, 06), 5000.00, "Java");

        System.out.println("Dados do Gerente:");
        gerente.informarSalario();
        gerente.informarProjeto();
        System.out.println("Idade: " + gerente.calcularIdade() + " anos");

        System.out.println("\nDados do Programador:");

        programador.informarSalario();
        programador.informarLinguagem();
        System.out.println("Idade: " + programador.calcularIdade() + " anos");
    }
}
