public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(33); // Tentando definir uma idade inválida
        System.out.println("Idade da pessoa: " + pessoa.getIdade()); // A idade não foi alterada devido á validação
    }
}
