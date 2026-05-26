public final class Cachorro extends Mamifero {
    public Cachorro(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() {
        this.comer("ração");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está latindo!");
    }
    
}
