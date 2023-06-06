/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussines;

/**
 *
 * @author red-iso
 */
public class Caja extends Contenedor {
    String forma;

    public Caja(String nombre, int ancho, int alto, int largo, String tamano , String forma) {
        super(nombre, ancho, alto, largo, tamano);
        this.forma=forma;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
    
    
}
