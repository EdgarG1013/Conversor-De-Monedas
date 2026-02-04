package com.edgar.conversordemonedas.Modelos;

import com.edgar.conversordemonedas.API.Conexion;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Conversiones {

    Scanner entrada = new Scanner(System.in);
    Conexion conexion = new Conexion();

    double cantidad;

    private List<String> historial = new ArrayList<>();


    public void IngresarCantidad() {

        System.out.println("------------------------------------------");
        System.out.println("       Ingrese la cantidad      ");
        System.out.println("------------------------------------------");

        cantidad = entrada.nextDouble();
        entrada.nextLine(); // Consumir el salto de línea pendiente

    }

    public void ConversionEstatica (String MonedaINI, String MonedaFIN ) {

        IngresarCantidad();

        MonedaAPI miMonedaApi = conexion.HacerConversion( MonedaINI + "/" + MonedaFIN + "/" + cantidad);
        Moneda miMoneda = new Moneda(miMonedaApi);

        String monedaAcambiar = "";
        String monedaCambiada = "";

        // Lógica para la moneda de ORIGEN (MonedaINI)
        if (MonedaINI.equalsIgnoreCase("USD")) {
            monedaAcambiar = "dólares";
        } else if (MonedaINI.equalsIgnoreCase("ARS")) {
            monedaAcambiar = "pesos argentinos";
        } else if (MonedaINI.equalsIgnoreCase("BRL")) {
            monedaAcambiar = "reales";
        } else if (MonedaINI.equalsIgnoreCase("COP")) {
            monedaAcambiar = "pesos colombianos";
        }

        // Lógica para la moneda de DESTINO (MonedaFIN)
        if (MonedaFIN.equalsIgnoreCase("USD")) {
            monedaCambiada = "dólares";
        } else if (MonedaFIN.equalsIgnoreCase("COP")) {
            monedaCambiada = "pesos colombianos";
        } else if (MonedaFIN.equalsIgnoreCase("ARS")) {
            monedaCambiada = "pesos argentinos";
        } else if (MonedaFIN.equalsIgnoreCase("BRL")) {
            monedaCambiada = "reales";
        }

        System.out.println("------------------------------------------\n");
        System.out.println("El valor de: "+ cantidad + " " + monedaAcambiar + " ("+ MonedaINI +") " + "son: " + miMoneda.getValor() + " " + monedaCambiada + " (" + miMoneda.getNombre() + ")");
        System.out.println("Usando una tasa de conversion de: "+ miMoneda.getTasaDeconversion() +"\n");

        String registro = cantidad + " " + monedaAcambiar + " (" + MonedaINI + ") => " + miMoneda.getValor() + " " + monedaCambiada + " (" + miMoneda.getNombre() + ") Tasa: " + miMoneda.getTasaDeconversion();
        historial.add(registro);

    }

    public void ConversionUniversal (String MonedaINI, String MonedaFIN ) {


        System.out.println("------------------------------------------");
        System.out.println(" Ingrese el Nombre de la moneda inicial y la moneda a  ");
        System.out.println("  cambiar en formato de divisas (ej. COP,USD,EUR) ");
        System.out.println("------------------------------------------");

        MonedaINI = entrada.nextLine().toUpperCase();

        System.out.println("------------------------------------------");

        MonedaFIN = entrada.nextLine().toUpperCase();

        IngresarCantidad();

        MonedaAPI miMonedaApi = conexion.HacerConversion( MonedaINI + "/" + MonedaFIN + "/" + cantidad);
        Moneda miMoneda = new Moneda(miMonedaApi);

        String monedaAcambiar = "";
        String monedaCambiada = "";

        // Lógica para la moneda de ORIGEN (MonedaINI)
        if (MonedaINI.equalsIgnoreCase("USD")) {
            monedaAcambiar = "dólares";
        } else if (MonedaINI.equalsIgnoreCase("ARS")) {
            monedaAcambiar = "pesos argentinos";
        } else if (MonedaINI.equalsIgnoreCase("BRL")) {
            monedaAcambiar = "reales";
        } else if (MonedaINI.equalsIgnoreCase("COP")) {
            monedaAcambiar = "pesos colombianos";
        }

        // Lógica para la moneda de DESTINO (MonedaFIN)
        if (MonedaFIN.equalsIgnoreCase("USD")) {
            monedaCambiada = "dólares";
        } else if (MonedaFIN.equalsIgnoreCase("COP")) {
            monedaCambiada = "pesos colombianos";
        } else if (MonedaFIN.equalsIgnoreCase("ARS")) {
            monedaCambiada = "pesos argentinos";
        } else if (MonedaFIN.equalsIgnoreCase("BRL")) {
            monedaCambiada = "reales";
        }

        System.out.println("------------------------------------------\n");
        System.out.println("El valor de: "+ cantidad + " " + monedaAcambiar + " ("+ MonedaINI +") " + "son: " + miMoneda.getValor() + " " + monedaCambiada + " (" + miMoneda.getNombre() + ")");
        System.out.println("Usando una tasa de conversion de: "+ miMoneda.getTasaDeconversion() +"\n");

        String registro = cantidad + " " + monedaAcambiar + " (" + MonedaINI + ") => " + miMoneda.getValor() + " " + monedaCambiada + " (" + miMoneda.getNombre() + ") Tasa: " + miMoneda.getTasaDeconversion();
        historial.add(registro);

    }

    public void verHistorial() {

        System.out.println("------------------------------------------");
        System.out.println("          Historial de conversiones       ");
        System.out.println("------------------------------------------");

        if (historial.isEmpty()) {
            System.out.println("No hay conversiones registradas.\n");
        } else {
            for (int i = 0; i < historial.size(); i++) {
                System.out.println((i+1) + ". " + historial.get(i));
            }
            System.out.println();
        }
    }




}
