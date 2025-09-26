
package Ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Declarando variables y objetos
        Scanner entrada = new Scanner(System.in);
        int num, resultado = 1;
        
        
        
        //Pidiendo el valor
        System.out.print("Ingrese el numero que desea saber su factorial: ");
        num = entrada.nextInt();
        
        //Bucle el donde iteraremos i para que se multiplique con el resultado
        for(int i = 1; i <= num; i++){
            //Guardando el resultado y volviendo a multiplicarlo
            resultado *= i ;
            
        }
        
        System.out.println("El facotorial es de "+num+" : "+ resultado);
        
    }
    
}
