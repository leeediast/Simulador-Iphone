package com.exemplo.iphonesimulator;

public interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void atenderChamada();
    void enviarSMS(String numero, String mensagem);
}
