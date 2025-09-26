package Ejercicio3;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Declaración de varibles y objetos
        Scanner entrada = new Scanner(System.in);
        double numero;
        boolean asistente = true;
        
        
        //Pidiendo el dato
        System.out.println("--------VALIDANDO NUMEROS PRIMOS---------");
        System.out.println("Ingresa el numero: ");
        numero = entrada.nextDouble();
        
        //Recorriendo el numero 
        //Comenzamos desde 2, ya que el uno divide a practicamente todos los numeros
        for(int i = 2; i <  numero; i++){
            
            //Verificando si el numero es divisible por i
            if ( numero % i == 0){
                
                //Si en cuentra un divisor se marcará como no primo y rompera el bucle (asistente lo declaramos true por asumir que el numero es primo)
                 asistente = false;
                 break;
            }
        }
        //Si asistente es true el numero es primo, si no es el caso entonces no es primo
        if(asistente){
            System.out.println("El numero es primo");
            
        }else{
            System.out.println("El numero no es primo");
        }
        
        
    }
    
}
