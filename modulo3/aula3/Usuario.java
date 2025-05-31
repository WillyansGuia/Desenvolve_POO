public class Usuario extends Pessoa {
    private int idade;
    private Emprestimo[] historicoEmprestimo;

    public Usuario(String pessoa, int idade) {
        super(pessoa);
        this.idade = idade;
        this.historicoEmprestimo = new Emprestimo[0];
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Emprestimo[] getHistoricoEmprestimo() {
        return historicoEmprestimo;
    }

    public void setHistoricoEmprestimo(Emprestimo[] historicoEmprestimo) {
        this.historicoEmprestimo = historicoEmprestimo;
    }
}
