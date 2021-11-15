/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema004;

import java.util.Scanner;

/**
 *
 * @author USUARIO 2021
 */
public class Problema004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        int numero_dias;
        double precio_habitacion;
        double subtotal;
        double descuento1;
        double porcentaje1 = 10;
        double descuento2;
        double porcentaje2 = 15;
        double total_pagar = 0;
        double descuento3;
        double porcentaje3 = 20;
        System.out.println("Ingrese el número de días a hospedarse");
        numero_dias = entrada.nextInt();

        System.out.println("Ingrese el precio de la habitación");
        precio_habitacion = entrada.nextDouble();

        subtotal = precio_habitacion * numero_dias;
        if (numero_dias < 0) {
            subtotal = 0;
            total_pagar = 0;
        } else {

            if (numero_dias <= 5 && numero_dias > 0) {
                total_pagar = subtotal;
            } else {
                if (numero_dias > 5 && numero_dias <= 10) {
                    descuento1 = (porcentaje1 * subtotal) / 100;
                    total_pagar = subtotal - descuento1;
                } else {
                    if (numero_dias > 10 && numero_dias <= 15) {
                        descuento2 = (porcentaje2 * subtotal) / 100;
                        total_pagar = subtotal - descuento2;
                    } else {
                        descuento3 = (porcentaje3 * subtotal) / 100;
                        total_pagar = subtotal - descuento3;

                    }
                }

            }
        }
        System.out.printf("El subtotal a pagar es: %.2f", subtotal);
        System.out.printf("   ");
        System.out.printf("El total a pagar es: %.2f", total_pagar);

    }
}
