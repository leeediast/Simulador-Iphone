package com.exemplo.iphonesimulator;

public class iphonesimulator implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public iPhone() {
        // Construtor vazio
    }

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    public void atenderChamada() {
        System.out.println("Atendendo chamada.");
    }

    public void enviarSMS(String numero, String mensagem) {
        System.out.println("Enviando SMS para " + numero + ": " + mensagem);
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
