
package Ejercicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {


    public static void main(String[] args) {
        // Declarion de variables, objetos y arraylist
        Scanner entrada = new Scanner(System.in);
        List<producto> lista = new ArrayList<producto> ();
        String ProductoNombre;
        double Precio, valorTotal = 0, sumatoriaProduct = 0;
        int cantidad, opcion = 0;
        
        
        //Bucle para generar el menú
        do{
            //Pidiendo una opcion al usuario
            System.out.println("-------Menu Inventario Tienda Margarita-------");
            System.out.println("1- Agregar un producto\n"
                    + "2- Mostrar los productos registrados\n"
                    + "3- Calcular el total de todo el inventario\n"
                    + "4- Salir");
            System.out.print("Ingresa una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            //Menu con switch  
            switch (opcion){
                
                case 1:
                    
                    //Pidiendo la informacion sobre el nuevo producto
                    System.out.print("Ingrese el nombre del producto: ");
                    ProductoNombre = entrada.nextLine();
                    System.out.print("Ingrese un precio para el producto: $");
                    Precio = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("Ingrese la cantidad de producto a registrar:");
                    cantidad = entrada.nextInt();
                    entrada.nextLine();
                    
                    //Añadiendo a la lista
                    lista.add(new producto(ProductoNombre,Precio,cantidad));
                    
                    System.out.println("Producto Registrado con exito");
                    break;
                case 2: 
                    //Mostrando los productos
                    System.out.println("***************Lista de productos*************** ");
                    
                    //Validando que hayan registros
                    if(lista.isEmpty()){
                        System.out.println("---No hay productos registrados---");
                    }
                    else{
                    for (producto prod:lista){
                        System.out.println("Nombre del Producto: "+ prod.getNombre() + "\n"
                                + "Precio del producto: $"+ prod.getPrecio()  + "\n"
                                  + "Cantidad: "+ prod.getCantidad() + "\n");
                    }
                    }
                    break;
                case 3:
                    //Calculando el valor total de todo el inventario
                    if(lista.isEmpty()){
                         System.out.println("---No hay productos registrados---");
                    }else{
                        
                     //iterando los registros
                     for(producto prod:lista){
                     
                         sumatoriaProduct = prod.getCantidad() * prod.getPrecio();
                         
                         valorTotal += sumatoriaProduct;
                     
                     }
                        System.out.printf("El valor total del inventario es de: $%.2f%n",valorTotal );
                    
                    }
                    
                    break;
                case 4:
                    System.out.println("Saliendo....\n Hasta pronto");
                    break;
                default : 
                    System.out.println("Opcion no encontrada.");
                    break;
            }
        }while (opcion != 4);
        
    }
    
}
