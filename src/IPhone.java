public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url);
    }

    @Override
    public void adicionarNovaAba(String nome) {
        System.out.println("Adicionando nova aba " + nome);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println("Selecionando música " + nome);
    }
}
