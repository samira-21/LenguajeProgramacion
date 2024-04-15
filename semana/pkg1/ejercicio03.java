/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg1;
import java.util.Scanner;

/**
 *
 * @author soller rivera samira tayli
 */
public class ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float base, altura, area, perimetro;
        
        System.out.print("ingrese la base: ");
        base = Float.parseFloat(teclado.nextLine());
        
        System.out.print("Ingrese la altura: ");
        altura = Float.parseFloat(teclado.nextLine());
        
        area = base * altura;
        perimetro = 2 * (base * altura);
        System.out.println("La longuitud es :" + altura);
        System.out.println("el area es :" + area);
        System.out.println("El perimetro es:" + perimetro);
    }
    
}
