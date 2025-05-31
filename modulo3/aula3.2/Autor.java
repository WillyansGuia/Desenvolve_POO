public class Autor extends Pessoa {
    private String nacionalidade;
    private Livro[] obrasPublicadas;

    public Autor(String pessoa, String nacionalidade) {
        super(pessoa);
        this.nacionalidade = nacionalidade;
        this.obrasPublicadas = new Livro[0];
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
}
