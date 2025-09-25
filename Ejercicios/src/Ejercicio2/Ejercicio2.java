package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    //Declaración de variables y objetos
    Scanner entrada = new Scanner(System.in);
    double num1;
    double num2;
    int opcion;
    
    do{
        System.out.println("---------------Calculadora---------------");
        System.out.println("1- Sumar \n"
                + "2- Restar\n"
                + "3- Multiplicar\n"
                + "4- Dividir\n"
                + "5- Potencia\n"
                + "6- Raíz cuadrada\n"
                + "7- Salir");
        System.out.print("Ingresa una opción:");
        opcion = entrada.nextInt();
        
        switch (opcion) {
            
            case 1:
                System.out.println("SUMANDO NUMEROS");
                System.out.print("Ingresa un numero: ");
                num1 = entrada.nextDouble();
                entrada.nextLine();
                System.out.print("Ingresa un segundo numero: ");
                num2 = entrada.nextDouble();
                entrada.nextLine();
                
                System.out.println("El resultado de la suma es de: "+ (num1 + num2));
                
                break;
            case 2:
                System.out.println("RESTANDO NUMEROS");
                System.out.print("Ingresa un numero: ");
                num1 = entrada.nextDouble();
                entrada.nextLine();
                System.out.print("Ingresa un segundo numero: ");
                num2 = entrada.nextDouble();
                entrada.nextLine();
                
                System.out.println("El resultado de la resta es de: "+ (num1 - num2));
                break;
            case 3:
                System.out.println("MULTIPLCANDO NUMEROS");
                System.out.print("Ingresa un numero: ");
                num1 = entrada.nextDouble();
                entrada.nextLine();
                System.out.print("Ingresa un segundo numero: ");
                num2 = entrada.nextDouble();
                entrada.nextLine();
                
                System.out.println("El resultado de la multiplicación es de: "+ (num1 * num2));
                
                break;
            case 4:
                System.out.println("DIVIDIENDO NUMEROS");
                System.out.print("Ingresa un numero: ");
                num1 = entrada.nextDouble();
                entrada.nextLine();
                System.out.print("Ingresa un segundo numero: ");
                num2 = entrada.nextDouble();
                entrada.nextLine();
                
                if( num2 == 0)
                {
                    System.out.println("No se puede divdir "+num1+" entre 0");
                }
                else{
                System.out.println("El resultado de la División es de: "+ (num1 / num2));
                        }
                
                break;
            case 5:
                System.out.println("POTENCIA DE UN NUMERO");
                System.out.print("Ingresa la base: ");
                num1 = entrada.nextDouble();
                entrada.nextLine();
                System.out.print("Ingresa el exponente: ");
                num2 = entrada.nextDouble();
                entrada.nextLine();
                
                System.out.println("el resultado de la potencia de "+ num1+"^"+num2+ " Es de :" + Math.pow(num1, num2) );
                break;
            case 6:
                System.out.println("RAIZ CUADRADA DE UN NUMERO");
                System.out.print("Ingresa el radicando: ");
                num1 = entrada.nextDouble();
                entrada.nextLine();
                
                if (num1 < 0) {
                    System.out.println(" No existe raíz cuadrada de números negativos");
                } else {
                    
                    System.out.println("√" + num1 + " = " + Math.sqrt(num1));
                }
                break;
            case 7:
                System.out.println("Saliendo\n Hasta luego...");
                break;
                default:
                    System.out.println("Opción no encontrada");
                    break;
        }
        
        
    }
        while(opcion != 7  );
    
    }
}
