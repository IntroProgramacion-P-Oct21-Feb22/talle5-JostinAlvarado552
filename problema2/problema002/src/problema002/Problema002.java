/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema002;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO 2021
 */
public class Problema002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre_articulo;
        double Valortotal;
        double cantidad_requerida;
        double precio_unitario;
        double porcentaje = 15;
        double descuento;

        System.out.println("Ingrese el nombre del artículo deseado");
        nombre_articulo = entrada.nextLine();
        System.out.println("Ingrese la cantidad requerida");
        cantidad_requerida = entrada.nextDouble();
        System.out.println("Ingrese el precio unitario del artículo requerido");
        precio_unitario = entrada.nextDouble();

        Valortotal = cantidad_requerida * precio_unitario;

        if (cantidad_requerida < 0 || precio_unitario < 0) {
            System.out.println("Datos fuera de rango");
        } else {
            if (cantidad_requerida > 50) {
                descuento = (Valortotal * porcentaje) / 100;
                Valortotal = Valortotal - descuento;
            }

          System.out.printf("El valor total a pagar es: %.2f", Valortotal);  
        }

    }
}
