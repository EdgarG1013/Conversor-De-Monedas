package com.edgar.conversordemonedas.Principal;

import com.edgar.conversordemonedas.API.Conexion;
import com.edgar.conversordemonedas.Modelos.Conversiones;
import com.edgar.conversordemonedas.Modelos.Moneda;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int Opcion;

        var Conversiones = new Conversiones();
        var Conexion = new Conexion();


        do {

            System.out.println("------------------------------------------");
            System.out.println("  Bienvenido/a al Conversor de Monedas ");
            System.out.println("------------------------------------------");
            System.out.println("Elige una de las opciones escribiendo en numero");
            System.out.println("------------------------------------------");
            System.out.println(" 1. Cambiar de una moneda a otra ");
            System.out.println(" 2. Ver la cambios históricos de una moneda");
            System.out.println(" 3. Ver mi historial de coversiones");
            System.out.println(" 4. Salir");
            System.out.println("------------------------------------------");

            Opcion = entrada.nextInt();
            entrada.nextLine(); // Consumir el salto de línea pendiente

            switch (Opcion) {

                case 1:

                    int OpcionCase1 = 0;

                    while (OpcionCase1 != 8) {


                        System.out.println("------------------------------------------");
                        System.out.println("      Cambiar de una moneda a otra        ");
                        System.out.println("------------------------------------------");
                        System.out.println(" 1. Dólar =>> Peso colombiano ");
                        System.out.println(" 2. Peso colombiano =>> Dólar");
                        System.out.println(" 3. Dólar =>> Real brasileño");
                        System.out.println(" 4. Real brasileño =>> Dólar");
                        System.out.println(" 5. Dólar =>> Peso argentino");
                        System.out.println(" 6. Peso argentino =>> Dólar");
                        System.out.println(" 7. Cambio personalizado ");
                        System.out.println("------------------------------------------");
                        System.out.println(" 8. Regresar al menu principal");
                        System.out.println("------------------------------------------");

                        OpcionCase1 = entrada.nextInt();
                        entrada.nextLine(); // Consumir el salto de línea pendiente

                        switch (OpcionCase1) {

                            case 1:

                                Conversiones.ConversionEstatica("USD", "COP");


                                break;

                            case 2:

                                Conversiones.ConversionEstatica("COP", "USD");

                                break;

                            case 3:

                                Conversiones.ConversionEstatica("USD", "BRL");

                                break;

                            case 4:

                                Conversiones.ConversionEstatica("BRL", "USD");

                                break;

                            case 5:

                                Conversiones.ConversionEstatica("USD", "ARS");

                                break;

                            case 6:

                                Conversiones.ConversionEstatica("ARS", "USD");

                                break;

                            case 7:

                                Conversiones.ConversionUniversal("" , "");

                                break;

                            case 8:

                                break;


                            default:

                                System.out.println("------------------------------------------");
                                System.out.println(" Opción no valida, Elige una opción del menu ");
                                System.out.println("------------------------------------------");

                        }

                    }


                    break;

                case 2:


                    break;

                case 3:

                    Conversiones.verHistorial();

                    break;

                default:

                    System.out.println("------------------------------------------");
                    System.out.println(" Opción no valida, Elige una opción del menu ");
                    System.out.println("------------------------------------------");

                    break;



            }

        } while (Opcion != 4);

    }

}
