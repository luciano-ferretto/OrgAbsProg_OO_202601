public final class Golfinho extends Mamifero{
    public Golfinho(String nome, Integer idade) {
        super(nome, idade, false);
    }
    @Override
    public void comer() {
        this.comer("peixes");
    }
    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " está assobiando!");
    }
}
