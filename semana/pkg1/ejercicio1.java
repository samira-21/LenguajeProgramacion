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
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float peso, altura, IMC;
        
        System.out.print("ingrese su peso: ");
        peso = Float.parseFloat(teclado.nextLine());
        
        System.out.print("ingrese su altura: ");
        altura = Float.parseFloat(teclado.nextLine());
        
        IMC = peso/(altura* altura);
        System.out.println("El peso es :" + peso);
        System.out.println("La altura es:" + altura);
        System.out.println("El IMC es: " + IMC);
        
        
    }
    
}
