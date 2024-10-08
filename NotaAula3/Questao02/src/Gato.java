public class Gato extends Animal {

    public Gato() {
        super();
    }

    public Gato(String nome, String raca) {
        super(nome, raca); // Chama o construtor da classe Animal com nome e raça
    }

    public void mia() {
        System.out.println(nome + " da raça " + raca + " está miando: Miau!");
    }
}
