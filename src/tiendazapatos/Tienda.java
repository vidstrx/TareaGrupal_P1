
package tiendazapatos;

public class Tienda {
    //Atributos
    private String[] marcas;
    private String[] color;
    private int[] tallas;
    private int precio;
    private int[] cantidadDisponible;

    public Tienda() {
    }
    
    public Tienda(String[] marcas, String[] color, int[] tallas, int precio, int[] cantidadDisponible) {
        this.marcas = marcas;
        this.color = color;
        this.tallas = tallas;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
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

    public int[] getCantidadDisponible() {
        return cantidadDisponible;
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

    public void setCantidadDisponible(int[] cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
}
