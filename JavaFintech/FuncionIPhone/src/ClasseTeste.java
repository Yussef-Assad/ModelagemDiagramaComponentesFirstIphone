public class ClasseTeste {
    public static void main(String[] args) {
        FunIphone meuiPhone = new FunIphone();

        meuiPhone.play();
        meuiPhone.fazerChamada("123-456-7890");
        meuiPhone.receberChamada();
        meuiPhone.abrirPaginaWeb("https://www.example.com");
        meuiPhone.navegarPaginaWeb();
        meuiPhone.pause();
        meuiPhone.encerrarChamada();
        meuiPhone.fecharPaginaWeb();
    }
}
