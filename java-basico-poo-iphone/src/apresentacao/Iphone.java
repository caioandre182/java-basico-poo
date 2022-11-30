package apresentacao;

import funcionalidades.Navegador;
import funcionalidades.ReprodutorMusical;
import funcionalidades.Telefone;

public class Iphone implements Navegador, Telefone, ReprodutorMusical {

    private String modelo;

    public Iphone(String modelo){
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void selecionarNovaAba() {
        System.out.println("Selecionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }
}
