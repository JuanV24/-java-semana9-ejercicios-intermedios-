
package Ejercicios;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
       //Declaración de variables y objetos
       Scanner entrada = new Scanner(System.in);
       int a = 0, b = 1 , c ,n;
       
       //Pidiendo cuantos numeros se quieren mostrar de fibonacci
        System.out.println("Ingresa cuantos numeros quieres ver de la serie de Fibonacci");
        n = entrada.nextInt();
        
        //Bucle para generar los numeros
        int i = 0;
        while( i <= n){
            
            //Intercambiando valores para sumarlos
            c = a + b;
            a = b;
            b = c;
            
            //Mostrando valores e iterando 1 a 1
            System.out.println(" " + a);
            i++;
            
             
        }
    }
    
}
