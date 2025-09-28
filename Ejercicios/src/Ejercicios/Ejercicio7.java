package Ejercicios;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio7 {

    public static void main(String[] args) {
        // Declaracion de variables y objetos
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(101);
        int numeroUsuario;
        int contador = 0;
        
        //Usando bucle para que el usuario ingrese el numero hasta acertar
        System.out.println(numeroAleatorio);
        
        do{
                //Pidiendo el numero
            System.out.println("*******************ADIVINA EL NUMERO*******************");
            System.out.print("Ingresa el numero: ");
            numeroUsuario = entrada.nextInt();
            entrada.nextLine();
            
            if(numeroUsuario > numeroAleatorio){
                System.out.println("Demasiado Alto. Sigue intentado.");
                contador++;
            }
            if(numeroUsuario < numeroAleatorio){
                System.out.println("Demasiado Bajo. Sigue intentado");
                contador++;
            }
            if(numeroUsuario == numeroAleatorio){
                contador++;
                System.out.println("¡Felicidades! Lo lograste en "+ contador+" Intentos");
                     
            }
         
            
        }while( numeroAleatorio != numeroUsuario);
        
    }
    
}
