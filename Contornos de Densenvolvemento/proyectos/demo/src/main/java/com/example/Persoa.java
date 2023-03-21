package com.example;

public class Persoa {
    private int idade;

    public Persoa(int idade) {
        this.idade = idade;
    }

    public boolean isMaiorDeIdade() {
        assert idade >= 0;
        return idade >= 18;
    }
}
