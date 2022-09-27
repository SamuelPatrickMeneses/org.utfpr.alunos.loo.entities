package org.utfpr.alunos.loo.entities;

public class InvalidValueExeption extends Exception{

    public InvalidValueExeption() {
        this("Valor invalido!");
    }

    public InvalidValueExeption(String message) {
        super(message);
    }

}