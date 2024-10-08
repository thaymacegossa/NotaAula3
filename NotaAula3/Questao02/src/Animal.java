public class Animal {
    protected String nome;
    protected String raca;


    public Animal() {
        this.nome = "Desconhecido";
        this.raca = "Desconhecida";
    }

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void caminha() {
        System.out.println(nome + " da raça " + raca + " está caminhando.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
