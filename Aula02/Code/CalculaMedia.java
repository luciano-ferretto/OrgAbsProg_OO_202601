void main() {
    double g1;
    double g2;
    IO.println("Bem vindo!!!"); // print -> Python
    String g1Str = IO.readln("Digite sua nota G1: "); // input -> Python
    String g2Str = IO.readln("Digite sua nota G2: ");
    g1 = Double.parseDouble(g1Str);
    g2 = Double.parseDouble(g2Str);
    double media = (g1 + g2) / 2;
    IO.println("Sua média é: " + media);
    if (media >= 7)
        IO.println("PARABÉNS! Você foi aprovado :-)");
    else if (media >= 3) {
        IO.println("Não foi dessa vez! Você está em exame :-(");
        IO.println("Para ser aprovado é necessário tirar: " + (10 - media));
    } else
        IO.println("Nos vemos no semestre que vem!!!!");

}