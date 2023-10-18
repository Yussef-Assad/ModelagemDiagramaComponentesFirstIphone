public class FunIphone implements ReprodutorDeMusica, Telefone, Navegador {
    private String currentSong;
    private String currentCall;
    private String currentURL;

    public void play() {
        System.out.println("Iniciando a reprodução de música.");
    }

    public void pause() {
        System.out.println("Pausando a reprodução de música.");
    }

    public void nextTrack() {
        System.out.println("Indo para a próxima faixa de música.");
    }

    public void prevTrack() {
        System.out.println("Voltando para a faixa anterior de música.");
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
        currentCall = numero;
    }

    public void receberChamada() {
        System.out.println("Recebendo chamada de " + currentCall);
    }

    public void encerrarChamada() {
        System.out.println("Encerrando chamada com " + currentCall);
        currentCall = null;
    }

    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo página da web: " + url);
        currentURL = url;
    }

    public void fecharPaginaWeb() {
        System.out.println("Fechando a página da web.");
        currentURL = null;
    }

    public void navegarPaginaWeb() {
        System.out.print("Navegando na página da web: " + currentURL);
    }

}
