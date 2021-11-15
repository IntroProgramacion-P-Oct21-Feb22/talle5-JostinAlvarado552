/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema001;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO 2021
 */
public class Problema001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    double CostoKilovatio_Hora;
    double Kilovatiosconsumidos_mes;
    int Edad;
    double porcentaje = 10;
    double ValorTotal;
    double descuento;
    
    System.out.println("Ingrese su edad");
    Edad = entrada.nextInt();
    
    System.out.println("Ingrese el costo del Kilovatio por hora");
    CostoKilovatio_Hora = entrada.nextDouble();
    
    System.out.println("Ingrese el valor de los kilovatios consumidos en el mes");
    Kilovatiosconsumidos_mes = entrada.nextDouble();
    
  ValorTotal = CostoKilovatio_Hora*Kilovatiosconsumidos_mes;

    if(Edad>65){
    descuento = (ValorTotal*porcentaje)/100;
    ValorTotal = ValorTotal-descuento;
    
    
    
    }
    
    System.out.printf("El valor total a pagar  es: %.2f"
            ,ValorTotal);
    
    }
    
}
