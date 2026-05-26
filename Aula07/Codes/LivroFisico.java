public class LivroFisico extends Livro {
    private int numeroExemplares;
    private String dimensoes;

    public LivroFisico(String titulo,
            String autor,
            int anoPublicacao,
            int numeroPaginas,
            int numeroExemplares,
            String dimensoes) {

        //this.setTitulo(titulo);
        //this.setAutor(autor);
        //this.setAnoPublicacao(anoPublicacao);
        //this.setNumeroPaginas(numeroPaginas);

        // Invoca o método construtor da SUPER CLASSE
        super(titulo, autor, anoPublicacao, numeroPaginas);

        this.numeroExemplares = numeroExemplares;
        this.dimensoes = dimensoes;
    }

    public int getNumeroExemplares() {
        return numeroExemplares;
    }

    public void setNumeroExemplares(int numeroExemplares) {
        this.numeroExemplares = numeroExemplares;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

     @Override //annotations
    public String toString() {
        //String texto = super.toString();
        //return texto
        return super.toString()
                + " | N. Exemplares: " + this.numeroExemplares
                + " | Dimensões: " + this.dimensoes; 
    }

}
