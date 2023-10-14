package com.example.guia1;

import com.example.guia1.CalculadoraClases.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import org.w3c.dom.ranges.RangeException;

@SpringBootTest
public class CalculadoraTest {

    @Test
    void SumarTest1(){
        var calculadora = new Calculadora();
        var resultado = calculadora.Suma(2,2);

        Assertions.assertEquals(2 + 2, resultado);
    }

    @Test
    void SumarPrimerNumeroNegativo() {
        var calculadora = new Calculadora();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculadora.Suma(-2, 2);
        });
    }

    @Test
    void SumarSegundoNumeroNegativo() {
        var calculadora = new Calculadora();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculadora.Suma(2,-2);
        });
    }

    @Test
    void SumarPrimerNumeroEsMaximo() {
        var calculadora = new Calculadora();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculadora.Suma(Integer.MAX_VALUE, 2);
        });
    }

    @Test
    void SumarSegundoNumeroEsMaximo() {
        var calculadora = new Calculadora();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculadora.Suma(2, Integer.MAX_VALUE);
        });
    }

    @Test
    void LaSumaSeSaleDelMaximo() {
        var calculadora = new Calculadora();

        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculadora.Suma(Integer.MAX_VALUE - 1, 2);
        });
    }

    @Test
    void LaSumaEsExactamenteElMaximo() {
        var calculadora = new Calculadora();
        var resultado = calculadora.Suma(Integer.MAX_VALUE - 1, 1);

        Assertions.assertEquals( Integer.MAX_VALUE, resultado);
    }



}
