package Ejercicios;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        // Declaración de objeto y variables
        Scanner entrada = new Scanner(System.in);
        int numNota;
        double[] notas;
        double maxNota = 0, minNota = 10, notaNueva, sumatoria = 0;

        // Preguntando la cantidad de notas a ingresar
        System.out.print("Ingrese la cantidad de notas a ingresar: ");
        numNota = entrada.nextInt();
        entrada.nextLine();

        // Asignando tamaño al array
        notas = new double[numNota];

        // Bucle para insertar las notas con validación
        for (int i = 0; i < numNota; i++) {
            do {
                System.out.println("Ingresa la nota (entre 0 y 10): ");
                notaNueva = entrada.nextDouble();
                entrada.nextLine();

                if (notaNueva < 0 || notaNueva > 10) {
                    System.out.println(" Nota inválida. Debe estar entre 0 y 10.");
                }
            } while (notaNueva < 0 || notaNueva > 10);

            notas[i] = notaNueva;
            sumatoria += notaNueva;

            if (notaNueva < minNota) {
                minNota = notaNueva;
            }
            if (notaNueva > maxNota) {
                maxNota = notaNueva;
            }
        }

        // Mostrando los datos
        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio: " + (sumatoria / numNota));
        System.out.println("Nota más baja: " + minNota);
        System.out.println("Nota más alta: " + maxNota);
    }
}
