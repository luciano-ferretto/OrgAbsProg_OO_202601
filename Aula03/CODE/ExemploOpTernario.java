void main() {

    String numStr = IO.readln("Digite um númeor: ");
    int num = Integer.parseInt(numStr);

    String resultado = (num % 2 == 0) ? "Par" : "Ímpar";

    if (num % 2 == 0)
        resultado = "Par";
    else
        resultado = "Ímpar";


    IO.println("O número digitado é " + resultado);


}