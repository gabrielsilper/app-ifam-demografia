package com.github.gabrielsilper.app_ifam_demografia.exceptions;

public class EstadoNotFoundException extends Exception {
    public EstadoNotFoundException() {
        super("Estado não encontrado!");
    }

    public EstadoNotFoundException(String message) {
        super(message);
    }
}
