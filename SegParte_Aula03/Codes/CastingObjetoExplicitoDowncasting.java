void main() {
    List<Animal> animais = List.of(
        new Cachorro("Totó", 5, "Labrador"),
        new Gato("Mingal", 2, "Branco")
    );
    exibirAnimais(animais);
}

void exibirAnimais(List<Animal> animais) {
    for (Animal animal : animais) {
        IO.println("Nome: " + animal.nome);
        IO.println("Idade: " + animal.idade);
        IO.println("Espécie: " + animal.especie);

        // Não é possível acessar os atributos específicos de Cachorro ou Gato diretamente,
        // porque o tipo da variável é Animal, e o tipo Animal não tem esses atributos.
        // IO.println("Raça: " + animal.raca); // isso causaria um erro de compilação
        // IO.println("Cor: " + animal.cor);   // isso causaria um erro de compilação

        // Então vou fazer um downcasting explícito 
        // para acessar os atributos específicos de cada tipo de animal
        Cachorro cachorro = (Cachorro) animal; // downcasting explícito de Animal para Cachorro
        IO.println("Raça: " + cachorro.raca); // agora posso acessar o atributo raca do cachorro

        // Se for necessário acessar o atributo especifico de uma subclasse, 
        // como raca de Cachorro ou cor de Gato,
        // é preciso fazer um downcasting explícito para a subclasse correta.
        // Mas isso deve ser feito com cuidado, verificando o tipo do objeto antes de fazer o downcasting,
        // para evitar erros de ClassCastException em tempo de execução.
        if (animal instanceof Cachorro) { //verifica se o animal é uma instância de Cachorro
            Cachorro cachorro2 = (Cachorro) animal; // downcasting explícito de Animal para Cachorro
            IO.println("Raça: " + cachorro2.raca); // agora posso acessar o atributo raca do cachorro
        } else if (animal instanceof Gato) { //verifica se o animal é uma instância de Gato
            Gato gato = (Gato) animal; // downcasting explícito de Animal para Gato
            IO.println("Cor: " + gato.cor); // agora posso acessar o atributo cor do gato
        }
    }
}