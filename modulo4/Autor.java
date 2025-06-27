public class Autor {
    private String nome;
    private boolean isUsuario;

    public Autor(String nome, boolean isUsuario) {
        this.nome = nome;
        this.isUsuario = isUsuario;
    }

    public String getNome() {
        return nome;
    }

    public boolean isUsuario() {
        return isUsuario;
    }

    @Override
    public String toString() {
        return nome + (isUsuario ? " (Usuário)" : " (Autor Tradicional)");
    }
}