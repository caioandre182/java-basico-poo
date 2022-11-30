package apresentacao;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("SE");

        //Reprodutor Musical
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println("---------");
        //Navegador
        iphone.exibirPagina();
        iphone.selecionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("---------");
        // Telefone
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

    }
}