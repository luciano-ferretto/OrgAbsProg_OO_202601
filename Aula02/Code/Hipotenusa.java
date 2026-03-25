void main() {
    String catetoAStr = IO.readln("Digite o valor do cateto A: ");
    double catetoA = Double.parseDouble(catetoAStr);
    String catetoBStr = IO.readln("Digite o valor do cateto B: ");
    double catetoB = Double.parseDouble(catetoBStr);

    double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
    hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

    IO.println("A Hipotenusa é: " + hipotenusa);
    

}