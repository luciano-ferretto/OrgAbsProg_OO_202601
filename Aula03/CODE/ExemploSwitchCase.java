void main() {
    IO.println("Biblio SYS");
    String menuLinha = "MENU\n1 - Cadastrar Livro.\n2 - Listar Livros.\n3 - Empréstimo de Livro.\n4 - Devolução de Livro.\n0 - Sair.";
    String menu = """
            MENU
            1 - Cadastrar Livro.
            2 - Listar Livros.
            3 - Empréstimo de Livro.
            4 - Devolução de Livro.
            0 - Sair.
            """;
    IO.println(menu);
    String opcaoStr = IO.readln("Digite uma opção: ");
    int opcao = Integer.parseInt(opcaoStr);
    switch (opcao) {
        case 1:
            IO.println("Cadastrando Livro...");
            break;
        case 2: 
            IO.println("Listando Livros...");
            break;
        case 3:
            IO.println("Emprestando Livro...");
            break;
        case 4:
            IO.println("Recebendo Livro...");
            break;
        default:
            IO.println("Opção Inválida!");
            break;
    }


}