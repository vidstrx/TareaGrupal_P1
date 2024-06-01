
package tiendazapatos;

public class Tienda {
    //Atributos
    private String[] marcas;
    private String[] color;
    private int[] tallas;
    private int precio;

    public Tienda() {
    }
    
    public Tienda(String[] marcas, String[] color, int[] tallas, int precio) {
        this.marcas = marcas;
        this.color = color;
        this.tallas = tallas;
        this.precio = precio;
    }

    public String[] getMarcas() {
        return marcas;
    }

    public String[] getColor() {
        return color;
    }

    public int[] getTallas() {
        return tallas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setMarcas(String[] marcas) {
        this.marcas = marcas;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public void setTallas(int[] tallas) {
        this.tallas = tallas;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void mostrarMarcas(){
        String [] marcas = new String[5];
        marcas[0] = "Converse"; marcas[1] = "Adidas"; marcas[2] = "Puma";
        marcas[3] = "Nike"; marcas[4] = "Vans";
        System.out.println("Marcas disponibles: ");
        for (int i = 0; i < marcas.length; i++) {
                System.out.println((i+1) +") " + (marcas[i]));
            }
    }
    
    public void mostrarColores(){
        String [] colores = new String[4];
        colores[0] = "Blanco"; colores[1] = "Negro"; colores[2] = "Azul";
        colores[3] = "Rojo";
        System.out.println("Colores disponibles: ");
        for (int i = 0; i < colores.length; i++) {
                System.out.println((i+1) +") " + (colores[i]));
            }
    }
    
    public void mostrarTallas(){
        int [] tallas = new int[5];
        tallas[0] = 28; tallas[1] = 32; tallas[2] = 34;
        tallas[3] = 38; tallas[4] = 40;
        System.out.println("Tallas disponibles: ");
        for (int i = 0; i < tallas.length; i++) {
                System.out.println((i+1) +") " + (tallas[i]));
            }
    }
    
    public String[] MarcasDisp(){
        String [] marcas = new String[5];
        marcas[0] = "Converse"; marcas[1] = "Adidas"; marcas[2] = "Puma";
        marcas[3] = "Nike"; marcas[4] = "Vans";
        return marcas;
    }
    
     public String[] coloresDisp(){
        String [] colores = new String[4];
        colores[0] = "Blanco"; colores[1] = "Negro"; colores[2] = "Azul";
        colores[3] = "Rojo";
        return colores;
    }
        
    public int[] tallasDisp(){
        int [] tallas = new int[5];
        tallas[0] = 28; tallas[1] = 32; tallas[2] = 34;
        tallas[3] = 38; tallas[4] = 40;
        return tallas;
    }
}
