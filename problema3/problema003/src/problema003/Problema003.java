/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema003;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO 2021
 */
public class Problema003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;
        double porcentaje_japon = 30;
        double porcentaje_alemania = 20;
        double porcentaje_italia = 15;
        double porcentaje_usa = 8;
        double impuesto_japon;
        double impuesto_alemania;
        double impuesto_italia;
        double impuesto_usa;

        double precioVenta;

        System.out.println("Ingrese la marca");
        marca = entrada.nextLine();

        System.out.println("Ingrese el origen");
        origen = entrada.nextLine();

        System.out.println("Ingrese el costo");
        costo = entrada.nextDouble();

        if (costo < 0) {
            System.out.println("Valor fuera de rango");
        } else {
            if (origen.equals("Alemania")) {
                impuesto_alemania = (costo * porcentaje_alemania) / 100;
                precioVenta = impuesto_alemania + costo;
                System.out.printf("El valor del impuesto a pagar es: %.2f\n"
                        + "El precio de venta total es: %.2f\n",
                        impuesto_alemania, precioVenta);
            } else {
                if (origen.equals("Japon")) {
                    impuesto_japon = (costo * porcentaje_japon) / 100;
                    precioVenta = impuesto_japon + costo;
                    System.out.printf("El valor del impuesto a pagar es: %.2f\n"
                            + "El precio de venta total es: %.2f\n", impuesto_japon,
                            precioVenta);
                } else {
                    if (origen.equals("Italia")) {
                        impuesto_italia = (costo * porcentaje_italia) / 100;
                        precioVenta = impuesto_italia + costo;
                        System.out.printf("El valor del impuesto a pagar es %.2f\n"
                                + "El precio de venta total es: %.2f\n",
                                impuesto_italia,
                                precioVenta);
                    } else {
                        if (origen.equals("USA")) {
                            impuesto_usa = (costo * porcentaje_usa) / 100;
                            precioVenta = impuesto_usa + costo;
                            System.out.printf("El valor del impuesto a pagar es %.2f\n"
                                    + "El precio de venta total es: %.2f\n",
                                    impuesto_usa,
                                    precioVenta);
                        } else {
                            System.out.printf("No necesita realizar pago de impuesto\n"
                                    + "El precio de venta total es: %.2f\n", costo);
                        }
                    }
                }
            }
        }
    }

}
