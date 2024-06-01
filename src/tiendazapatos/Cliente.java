/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendazapatos;

/**
 *
 * @author PC
 */
public class Cliente {
    private String nombre;
    private String marcapreferida;
    private String colorfavorito;
    private int talla;
    private int presupuesto;

    public Cliente() {
    }
    

    public Cliente(String nombre, String marcapreferida, String colorfavorito, int talla, int presupuesto) {
        this.nombre = nombre;
        this.marcapreferida = marcapreferida;
        this.colorfavorito = colorfavorito;
        this.talla = talla;
        this.presupuesto = presupuesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarcapreferida(String marcapreferida) {
        this.marcapreferida = marcapreferida;
    }

    public void setColorfavorito(String colorfavorito) {
        this.colorfavorito = colorfavorito;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getMarcapreferida() {
        return marcapreferida;
    }

    public String getColorfavorito() {
        return colorfavorito;
    }

    public int getTalla() {
        return talla;
    }

    public int getPresupuesto() {
        return presupuesto;
    }
    
    
}

