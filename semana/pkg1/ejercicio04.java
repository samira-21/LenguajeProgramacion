/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg1;
import java.util.Scanner;

/**
 *
 * @author Soller Rivera Samira Tayli
 */
public class ejercicio04 {
    public static void main(String[] args) {
        float PI, area,altura,rad,volumen;
        
        PI = 3.1416F;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese la altura del cilindro: ");
        altura = Float.parseFloat(teclado.nextLine());
        
        System.out.print("Ingrese el valor del radio del cilindro: ");
        rad = Float.parseFloat(teclado.nextLine());
        
        area = 2 *PI *rad *(rad + altura);
        System.out.println("El area total del cilindro es:" + area);
        volumen = PI*rad*rad*altura;
        System.out.println("El volumen del cilindro es:" + volumen);
        
        
        
        
        

    }
    
}
