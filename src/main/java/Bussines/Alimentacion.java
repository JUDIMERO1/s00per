/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussines;

/**
 *
 * @author red-iso
 */
public class Alimentacion extends Producto {
    String subtipo;

    public Alimentacion(String nombre, int precio, int temperatura, 
            String caducidad, int volumen, int peso, String subtipo) {
        super(nombre, precio, temperatura, caducidad, volumen, peso,"Alimentacion");
        this.subtipo=subtipo;
    }

    public String getsubTipo() {
        return tipo;
    }

    public void setsubTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
