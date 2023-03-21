package com.example;

public class Division {
    public float calcularDivision(float dividendo, float divisor) throws Exception {
        if (divisor == 0) {
            throw (new Exception("Erro. O divisor non pode ser 0."));
        }
        float resultado = dividendo / divisor;
        return resultado;
    }
}

