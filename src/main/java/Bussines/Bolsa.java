/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussines;

/**
 *
 * @author red-iso
 */
public class Bolsa extends Contenedor  {
    int resistenciaMax;

    public Bolsa(String nombre, int ancho, int alto, int largo, String tamano, int resistenciaMax) {
        super(nombre, ancho, alto, largo, tamano);
        this.resistenciaMax=resistenciaMax;
    }  
    
    public int getResistenciaMax() {
        return resistenciaMax;
    }

    public void setResistenciaMax(int resistenciaMax) {
        this.resistenciaMax = resistenciaMax;
    }
    
    
}
