/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg1;
import java.util.Scanner;

/**
 *
 * @author samira
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float longitud, ancho, area;
        
        System.out.print("ingrese la longitud: ");
        longitud = Float.parseFloat(teclado.nextLine());
        
        System.out.print("ingrese el ancho: ");
        ancho = Float.parseFloat(teclado.nextLine());
        
        area = longitud * ancho;
        System.out.println("La longuitud es  :" + longitud);
        System.out.println("La ancho es: " + ancho);
        System.out.println("El area es  : " + area);
    }
    
}
