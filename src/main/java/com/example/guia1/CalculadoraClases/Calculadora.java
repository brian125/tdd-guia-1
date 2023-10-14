package com.example.guia1.CalculadoraClases;

import com.example.guia1.CalculadoraInterfaces.ICalculadora;
import org.springframework.cglib.core.Converter;

public class Calculadora implements ICalculadora {

    @Override
    public int Suma(int num1, int num2) {

        if (num1 < 0) {
            throw new IllegalArgumentException("el primer número no debe ser negativo");
        }

        if (num2 < 0) {
            throw new IllegalArgumentException("el segundo número no debe ser negativo");
        }

        if (num1 >= Integer.MAX_VALUE) {
            throw new IllegalArgumentException("El primer número se sale del máximo entero");
        }

        if (num2 >= Integer.MAX_VALUE) {
            throw new IllegalArgumentException("El segundo número se sale del máximo entero");
        }

        if ( (num1 + num2) == -Integer.MAX_VALUE ) {
            throw new ArithmeticException("La suma se sale del máximo!");
        }
        return num1 + num2;
    }
}
