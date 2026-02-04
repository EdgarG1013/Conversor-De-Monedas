package com.edgar.conversordemonedas.Modelos;

import java.util.ArrayList;
import java.util.List;

public class Moneda {

    private String nombre;
    private double valor;
    private double tasaDeconversion;

    public Moneda (MonedaAPI monedaAPI) {

        this.nombre = monedaAPI.target_code();
        this.valor = Double.parseDouble(monedaAPI.conversion_result());
        this.tasaDeconversion = Double.parseDouble(monedaAPI.conversion_rate());

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTasaDeconversion() {
        return tasaDeconversion;
    }

    public void setTasaDeconversion(double tasaDeconversion) {
        this.tasaDeconversion = tasaDeconversion;
    }

}
