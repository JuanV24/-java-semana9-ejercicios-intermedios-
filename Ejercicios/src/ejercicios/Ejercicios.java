package ejercicios;

import java.util.Scanner;
public class Ejercicios {

    public static void main(String[] args) {
      //Declaracion de Variables y objetos
        Scanner entrada = new Scanner(System.in);
        double Saldo = 0;
        double Retiro = 0;
        double Deposito = 0;
        int opcion  = 0;
  
        
        //Creacion de bucle para el menu con Dowhile
        do{
            System.out.println("------------------------------------------");
            System.out.println("            BANCO AZTECA                ");
            System.out.println("------------------------------------------");
            
            System.out.println("MENU:\n"
                    + "1- Cosultar Sado\n"
                    + "2- Depositar\n"
                    + "3- Retirar\n");
            System.out.print("Ingresa una opción: (1-3) ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion){
                case 1: 
                    System.out.print("Tu saldo es de: $"+Saldo +"\n");
                    break;
                case 2:
                    //Pidiendo la cantidad
                    System.out.print("Ingresa la cantidad que quieras depositar: $");
                    Deposito = entrada.nextDouble();
                    entrada.nextLine();
                    
                    //Validando la cantidad
                    if(Deposito <= 0){
                        System.out.println("Ingresa una cantidad correcta");
                    }else {
                     //Despositando la cantidad
                    Saldo += Deposito;
                    System.out.println("Tu saldo se guardo correctamente");
                        System.out.print("Saldo: $"+Saldo+"\n");
                    }
                    break;
                case 3:
                    System.out.println("Ingresa la cantidad que deseas retirar: $");
                    Retiro = entrada.nextDouble();
                    entrada.nextLine();
                    
                    if (Retiro <= 0 || Retiro > Saldo || Saldo <= 0) {
                        System.out.println("Retiro inválido");
                    } else {
                        Saldo -= Retiro;
                        System.out.print("Retiro Exitoso\n Tu saldo es de: $" + Saldo+"\n");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema\n Hasta luego....");
                    break;
                    default:
                        System.out.print("Opción no encontrada ");
                    break;
            }
            
        }
        while(opcion !=4);
        
    }
    
}
