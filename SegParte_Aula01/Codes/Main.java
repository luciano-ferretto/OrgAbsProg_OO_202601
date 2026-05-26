import java.util.ArrayList;
import java.util.List;

void main() {

    

    Animal toto = new Cachorro("Totó", 5);
    Animal ariel = new Gato("Ariel", 8);
    Animal flipper = new Golfinho("Flipper", 20);

    List<Animal> animais = new ArrayList<>();
    animais.add(toto);
    animais.add(ariel);
    animais.add(flipper);

    listarAnimais(animais);
}

void listarAnimais(List<Animal> animais) {
    for (Animal animal : animais) {
        IO.println(animal.toString());
        animal.comer(); // De qual classe o método comer() será invocado?
                        // Depende do tipo concreto do objeto
        animal.emitirSom();
    }
}