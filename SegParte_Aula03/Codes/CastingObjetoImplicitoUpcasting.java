void main() {
    Cachorro toto = new Cachorro("Totó", 5, "Labrador");
    // upcasting implícito de Cachorro para Animal  
    // isso é possível porque Cachorro é um tipo de Animal (herança)
    Animal animalToto = toto;

    // outro exemplo de upcasting implícito de Gato para Animal
    // isso é possível porque Gato também é um tipo de Animal (herança)
    Animal animalMingal = new Gato("Mingal", 2, "Branco");

    IO.println("Nome do cachorro: " + animalToto.nome);
    //IO.println("Raça do cachorro: " + animalToto.raca); 
    // mesmo referenciando um objeto do tipo Cachorro, 
    //     o tipo da variável é Animal, e o tipo Animal não tem o atributo raca
    IO.println("Nome do gato: " + animalMingal.nome);
}


