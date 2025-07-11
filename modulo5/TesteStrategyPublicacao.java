public class TesteStrategyPublicacao {
    public static void main(String[] args) {
        Autor autor = new Autor("Willyans");

        // Estratégia para artigo
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        System.out.print(autor.getNome() + ": ");
        autor.publicar(); // Deve imprimir: Publicando um artigo...

        // Estratégia para livro
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        System.out.print(autor.getNome() + ": ");
        autor.publicar(); // Deve imprimir: Publicando um livro...

        // Sem estratégia definida
        autor.setEstrategiaPublicacao(null);
        System.out.print(autor.getNome() + ": ");
        autor.publicar(); // Deve imprimir: Nenhuma estratégia de publicação definida.
    }
}