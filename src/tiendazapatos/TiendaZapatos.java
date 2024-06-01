
package tiendazapatos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TiendaZapatos {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        Tienda tienda = new Tienda();
        System.out.println("----Bienvenido a la Tienda----");
        tienda.mostrarMarcas(); tienda.mostrarColores(); tienda.mostrarTallas();
        Cliente cliente = new Cliente();
        
        System.out.println("Ingrese su nombre:");
        String nombre = lea.nextLine();
        cliente.setNombre(nombre);
        
        System.out.println("Ingrese su marca preferida:");
        String marca = lea.nextLine();
        cliente.setMarcapreferida(marca);
        
        System.out.println("Ingrese su color favorito:");
        String color = lea.nextLine();
        cliente.setColorfavorito(color);
        
        System.out.println("Ingrese su talla:");
        int talla = lea.nextInt();
        cliente.setTalla(talla);
        
        System.out.println("Ingrese su prespuesto:");
        int presupuesto = lea.nextInt();
        cliente.setPresupuesto(presupuesto);
        
        
        
        
    }
    
}
