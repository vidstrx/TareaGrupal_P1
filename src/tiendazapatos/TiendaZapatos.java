
package tiendazapatos;

import java.util.Scanner;

public class TiendaZapatos {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Tienda tienda = new Tienda(); Cliente cliente = new Cliente();
        
        System.out.println("----Bienvenido a la Tienda----");
        tienda.mostrarMarcas(); tienda.mostrarColores(); tienda.mostrarTallas();
        
        System.out.print("\nIngrese su nombre: ");
        String nombre = lea.nextLine();
        cliente.setNombre(nombre);
        
        System.out.print("Ingrese su marca preferida: ");
        String marca = lea.nextLine();
        cliente.setMarcapreferida(marca);
        switch(marca.toLowerCase()){
            case "converse":
                tienda.setPrecio(1000);
                break;
            case "adidas":
                tienda.setPrecio(2000);
                break;
            case "puma":
                tienda.setPrecio(1300);
                break;
            case "nike":
                tienda.setPrecio(3200);
                break;
            case "vans":
                tienda.setPrecio(1200);
                break;
        }
        
        System.out.print("Ingrese su color favorito: ");
        String color = lea.nextLine();
        cliente.setColorfavorito(color);
        
        System.out.print("Ingrese su talla: ");
        int talla = lea.nextInt();
        cliente.setTalla(talla);
        
        System.out.print("Ingrese su prespuesto: ");
        int presupuesto = lea.nextInt();
        cliente.setPresupuesto(presupuesto);
        
        tienda.setMarcas(tienda.MarcasDisp());
        tienda.setColor(tienda.coloresDisp());
        tienda.setTallas(tienda.tallasDisp());
        
        System.out.println("\n" + cliente);
        
        boolean encontrarMarca = buscarMarca(tienda, cliente); boolean encontrarColor = buscarColor(tienda, cliente);
        boolean encontrarTalla = buscarTalla(tienda, cliente);
        if (encontrarMarca && encontrarColor && encontrarTalla){
            System.out.println("Esta disponible. El precio es: " + tienda.getPrecio());
            
            int eleccion = 0;
            while(true){
                System.out.print("\nDeseas comprarlo(1. Si / 2. No)? ");
                eleccion = lea.nextInt();
                if (eleccion == 1 || eleccion == 2){
                    break;
                } else { 
                    System.out.println("Elije una opcion valida");
                }
            }
            switch(eleccion){
                case 1:
                if (tienda.getPrecio() <= cliente.getPresupuesto()){
                    System.out.println("\n--------Factura----------\nNombre: " + cliente.getNombre() + "\nMarca comprada: " + cliente.getMarcapreferida() + "\nColor escogido: " + cliente.getColorfavorito() + "\nTalla escogida: " + cliente.getTalla() + "\nPrecio a pagar: " + tienda.getPrecio() + "\n-------------------------");
                    System.out.println("Gracias por su compra!");
                } else {
                    System.out.println("\nFondos insuficientes\nLe hace falta una cantidad de: " + (tienda.getPrecio() - cliente.getPresupuesto()) + ". Vuelva en cuando tenga mas presupuesto.");
                }
                break;
                case 2:
                    System.out.println("\nGracias por visitar nuestra tienda");
                    break;
            }
            
        } else {
            System.out.println("\nNo esta disponible, lamentamos los inconvenientes\nVuelva pronto :D");
        }
    }
    
    public static boolean buscarMarca(Tienda tienda, Cliente cliente){
        boolean encontrar = false;
        String marcaEscogida = cliente.getMarcapreferida();
        String [] marca = tienda.getMarcas();
        for (int i = 0; i < marca.length; i++) {
            if (marcaEscogida.equalsIgnoreCase(marca[i])){
                encontrar = true;
                break;
            } else {
                encontrar = false;
            }
        }
        return encontrar;
    }
    
    public static boolean buscarColor(Tienda tienda, Cliente cliente){
        boolean encontrar = false;
        String colorEscogida = cliente.getColorfavorito();
        String [] color = tienda.getColor();
        for (int i = 0; i < color.length; i++) {
            if (colorEscogida.equalsIgnoreCase(color[i])){
                encontrar = true;
                break;
            } else {
                encontrar = false;
            }
        }
        return encontrar;
    }
    
    public static boolean buscarTalla(Tienda tienda, Cliente cliente){
        boolean encontrar = false;
        int tallaEscogida = cliente.getTalla();
        int [] talla = tienda.getTallas();
        for (int i = 0; i < talla.length; i++) {
            if (tallaEscogida == (talla[i])){
                encontrar = true;
                break;
            } else {
                encontrar = false;
            }
        }
        return encontrar;
    }
}
