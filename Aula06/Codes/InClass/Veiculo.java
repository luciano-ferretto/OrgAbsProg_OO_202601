import java.time.LocalDate;

class Veiculo {
    String marca;
    String modelo;
    int ano;
    String placa;

    //Método construtor default
    Veiculo() {
        this("Marca não definida", "Modelo não definido", 2000, "");
    }
    // Sobrecarga do método construtor
    Veiculo(String marca, String modelo, int ano, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    int calculaTempoUso() {
        int anoAtual = LocalDate.now().getYear();
        int tempoUso = this.calculaTempoUso(anoAtual);
        //IO.println("Tempo de uso: " + tempoUso);
        return tempoUso;
    }
    // Sobrecarga de Método
    // 2 ou mais métodos podem ter o mesmo identificador
    //   desde que parâmetros diferentes (tipos ou número)
    int calculaTempoUso(int anoBase) {
        return anoBase - this.ano;
    }

    Veiculo cloneMe() {
        Veiculo novo = new Veiculo();
        novo.marca = this.marca;
        novo.modelo = this.modelo;
        novo.ano = this.ano;
        novo.placa = this.placa;
        return novo;
    }
}