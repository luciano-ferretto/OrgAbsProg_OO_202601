public final class Gato extends Mamifero {
    public Gato(String nome, Integer idade) {
        super(nome, idade, true);
    }
    @Override
    public void comer() {
        this.comer("carne");
    }
    @Override
    public void emitirSom() {
        IO.println(this.getNome() +  " está miando!");
    }
}
