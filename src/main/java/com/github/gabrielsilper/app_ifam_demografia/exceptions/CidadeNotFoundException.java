package com.github.gabrielsilper.app_ifam_demografia.exceptions;

public class CidadeNotFoundException extends Exception {
    public CidadeNotFoundException() {
        super("Cidade não encontrada!");
    }

    public CidadeNotFoundException(String message) {
        super(message);
    }
}

