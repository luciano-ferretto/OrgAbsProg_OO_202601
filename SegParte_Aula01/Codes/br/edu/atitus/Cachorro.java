package br.edu.atitus;

import br.edu.atitus.interfaces.*;
//import br.edu.atitus.interfaces.Nado;

public final class Cachorro extends Mamifero implements Corrida, Nado{
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

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando estilo cachorrinho!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo por todo o pátio!");
    }
    
}
