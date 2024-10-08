public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Frederico", "Golden");
        cachorro.caminha();
        cachorro.late();

        Gato gato = new Gato("Paçoca", "Persa");
        gato.caminha();
        gato.mia();
    }
}
