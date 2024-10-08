public class Cachorro extends Animal {

    public Cachorro() {
        super();
    }

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void late() {
        System.out.println(nome + " da raça " + raca + " está latindo: Au Au!");
    }
}
