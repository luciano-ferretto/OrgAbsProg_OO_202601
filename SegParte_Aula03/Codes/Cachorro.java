public class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, "Mamífero"); // chama o construtor da classe pai (Animal)
        this.raca = raca;
    }
    
}
