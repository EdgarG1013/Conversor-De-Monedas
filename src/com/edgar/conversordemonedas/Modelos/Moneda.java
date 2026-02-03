package com.edgar.conversordemonedas.Modelos;

public class Moneda {

    private String nombre;
    private int valor;
    private int tasaDeconversion;

    public Moneda (MonedaAPI monedaAPI) {

        this.nombre = monedaAPI.target_code();
        this.valor = Integer.parseInt(monedaAPI.conversion_result());
        this.tasaDeconversion = Integer.parseInt(monedaAPI.conversion_rate());

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
        return "Moneda{" +
                "target_code='" + nombre + '\'' +
                ", conversion_result=" + valor +
                ", tasaDeconversion='" + tasaDeconversion + '\'' +
                '}';
    }
}
