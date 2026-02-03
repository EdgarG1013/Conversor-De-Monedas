package com.edgar.conversordemonedas.Modelos;

import com.edgar.conversordemonedas.Principal.Principal;
import com.sun.jdi.IntegerValue;

public class Moneda {

    private String nombre;
    private int valor;
    private int tasaDeconversion;

    public Moneda (MonedaAPI monedaAPI) {

        this.nombre = monedaAPI.target_code();
        this.valor = (int) Double.parseDouble(monedaAPI.conversion_result());
        this.tasaDeconversion = (int) Double.parseDouble(monedaAPI.conversion_rate());

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getTasaDeconversion() {
        return tasaDeconversion;
    }

    public void setTasaDeconversion(int tasaDeconversion) {
        this.tasaDeconversion = tasaDeconversion;
    }

    @Override
    public String toString() {
        return """
                Cambio de Moneda de Dólar a pesos colombianos (COP)
                """ +
                "Tipo de moneda: " + nombre + ", " +
                "Son: " + valor + ", " +
                "tasa De conversion: " + tasaDeconversion;
    }
}
