package model;

import model.impl.AparelhoTelefonico;
import model.impl.NavegadorInternet;
import model.impl.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public Iphone() {
        System.out.println("iniciar iphone...");
    }

    @Override
    public void ligar() {
        System.out.println("ligar");
    }

    @Override
    public void atender() {
        System.out.println("atender");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("iniciar correio de vos");
    }

    @Override
    public void exibirPagina() {
        System.out.println("exibir página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizar página");
    }

    @Override
    public void tocar() {
        System.out.println("tocar");
    }

    @Override
    public void pausar() {
        System.out.println("pausar");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionar música");
    }
}
