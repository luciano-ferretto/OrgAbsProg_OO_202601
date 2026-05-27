package br.edu.atitus;

import br.edu.atitus.interfaces.Corrida;
import br.edu.atitus.interfaces.Nado;
import br.edu.atitus.interfaces.Voo;

public class Pato extends Ave implements Corrida, Nado, Voo{

    public Pato(String nome, Integer idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("plantinhas do lago");
    }

    
    @Override
    public void emitirSom() {
        IO.println(getNome() + " está grasnando");
    }
    

    @Override
    public void voar() {
        IO.println(this.getNome() + " está voando em migração para o Sul!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está nadando elegantemente!");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está correndo todo atrapalhado!");
    }

}
