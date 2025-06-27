public class Autor extends Pessoa {
    private String nacionalidade;
    private Livro[] obrasPublicadas;
    private boolean isUsuario;

    public Autor(String pessoa, String nacionalidade, boolean isUsuario) {
        super(pessoa);
        this.nacionalidade = nacionalidade;
        this.obrasPublicadas = new Livro[0];
        this.isUsuario = isUsuario
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Livro[] getObrasPublicadas() {
        return obrasPublicadas;
    }

     public boolean isUsuario() {
        return isUsuario;
    }

    public void setObrasPublicadas(Livro[] obrasPublicadas) {
        this.obrasPublicadas = obrasPublicadas;
    }

    public Livro[] getObrasPublicadasGenero(String genero) {
        int count = 0;
        for (Livro livro : obrasPublicadas) {
            if (livro.getGenero().equals(genero)) {
                count++;
            }
        }
        Livro[] result = new Livro[count];
        int index = 0;
        for (Livro livro : obrasPublicadas) {
            if (livro.getGenero().equals(genero)) {
                result[index++] = livro;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return nome + (isUsuario ? " (Usuário)" : " (Autor Tradicional)");
    }
}
