public class Gato extends Animal {
    String cor;

    public Gato(String nome, int idade, String cor) {
        super(nome, idade, "Mamífero"); // chama o construtor da classe pai (Animal)
        this.cor = cor;
    }
    
}
