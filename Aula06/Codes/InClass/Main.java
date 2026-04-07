void main() {
    //Estou criando uma variável chamada "uno"
    // do tipo "Veiculo", e estou atribuindo
    // uma nova instância a partir da classe "Veiculo"
    // "new Veiculo()" == > Instanciando um novo objeto a partir da classe Veiculo
    Veiculo uno = new Veiculo();
    uno.marca = "Fiat";
    uno.modelo = "Uno";
    uno.ano = 1994;
    uno.placa = "ABC-1234";

    Veiculo fusca; // Declarando uma variável do tipo "Veiculo" chamada "fusca"
    fusca = new Veiculo(); // Atribuindo uma nova instância da classe "Veiculo" para variável "fusca"
    fusca.marca = "Volswagem";
    fusca.modelo = "Fusca do Itamar";
    fusca.ano = 1995;
    fusca.placa = "ABC-4321";
     
    int tempoUsoUno = uno.calculaTempoUso();
    int tempoUsoFusca = fusca.calculaTempoUso();
    IO.println("Tempo de uso do Uno: " + tempoUsoUno);
    IO.println("Tempo de uso do Fusca: " + tempoUsoFusca);

    int tempoUsoUno2030 = uno.calculaTempoUso(2030);
    IO.println("Tempo de uso do Uno em 2030: " +tempoUsoUno2030);


    Veiculo fuscaSeriePrata = fusca.cloneMe();


    Veiculo cerato = new Veiculo("Kia", "Cerato", 2011, "XYZ-3333");


    IO.readln();


}