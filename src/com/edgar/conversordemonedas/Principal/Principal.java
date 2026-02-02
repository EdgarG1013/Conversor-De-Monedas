package com.edgar.conversordemonedas.Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int Opcion;

        do {

            System.out.println("------------------------------------------");
            System.out.println("  Bienvenido/a al Conversor de Monedas ");
            System.out.println("------------------------------------------");
            System.out.println("Elige una de las opciones escribiendo en numero");
            System.out.println("------------------------------------------");
            System.out.println(" 1. Cambiar de una moneda a otra ");
            System.out.println(" 2. Ver el valor histórico de una moneda");
            System.out.println(" 3. Ver mi historial de coversiones");
            System.out.println(" 4. Salir");
            System.out.println("------------------------------------------");

            Opcion = entrada.nextInt();

            switch (Opcion) {

                case 1:

                    System.out.println("------------------------------------------");
                    System.out.println("       Cambiar de una moneda a otra       ");
                    System.out.println("------------------------------------------");
                    System.out.println(" 1. Dólar =>> Peso colombiano ");
                    System.out.println(" 2. Peso colombiano =>> Dólar");
                    System.out.println(" 3. Dólar =>> Real brasileño");
                    System.out.println(" 4. Real brasileño =>> Dólar");
                    System.out.println(" 5. Dólar =>> Peso argentino");
                    System.out.println(" 6. Peso argentino =>> Dólar");
                    System.out.println("------------------------------------------");
                    System.out.println(" 7. Regresar al menu principal");
                    System.out.println(" 8. Salir del programa");
                    System.out.println("------------------------------------------");

                    int OpcionCase1 = entrada.nextInt();

                    if (OpcionCase1 == 8){
                        Opcion = 4;
                    }


                    break;

                case 2:


                    break;

                case 3:


                    break;

                case 5:

                    break;

                case 6:

                    break;

            }

        } while (Opcion != 4);

    }

}
