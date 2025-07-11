public abstract class UsuarioDecorator implements PublicavelInterface {
    protected PublicavelInterface estrategiaPublicacao;

    public void setEstrategiaPublicacao(PublicavelInterface estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    @Override
    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
    }
}