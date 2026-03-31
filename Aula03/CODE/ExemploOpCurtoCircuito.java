void main() {
    IO.println("Verificação de Divisão (Fator)");

    String xStr = IO.readln("Digite o valor de X: ");
    String yStr = IO.readln("Digite o valor de Y: ");

    int x = Integer.parseInt(xStr);
    int y = Integer.parseInt(yStr);

    //if (x != 0 & y % x == 0) ==> ERRADO
    if (x != 0 && y % x == 0)
        IO.println("X é fator (divisor) de Y");
    else
        IO.println("X NÃO é fator (divisor) de Y");

}