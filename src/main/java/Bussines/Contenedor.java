/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussines;

import java.util.ArrayList;

/**
 *
 * @author red-iso
 */
public class Contenedor {
    String nombre;
    int ancho;
    int alto;
    int largo;
    String tamano;
    int volumen;
    int espacioDisponible;
    ArrayList<Producto> listProducto;

    public Contenedor(String nombre, int ancho, int alto, int largo, String tamano) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.tamano = tamano;
        this.volumen = this.calcularVolumen(ancho, alto, largo);
        this.espacioDisponible = this.volumen;
        this.listProducto=new   ArrayList();
    }
    
    public Boolean agregarProducto(Producto p){
        Boolean cad=false;

            if(this.listProducto.get(0)!=null){
              if((this.espacioDisponible-p.getVolumen())>=0){
                if(this.listProducto.get(0).getTipo()=="Alimentacion"){
                    
                    if(p.getTipo()=="Alimentacion"){       
                            this.listProducto.add(p);
                            this.espacioDisponible=this.espacioDisponible-p.getVolumen();
                            cad=true; 
                    }
                    
                }else if(this.listProducto.get(0).getTipo()=="Higiene"){
                    
                    if(p.getTipo()=="Higiene"|| p.getTipo()=="Drogueria"){
                            this.listProducto.add(p);
                            this.espacioDisponible=this.espacioDisponible-p.getVolumen();
                            cad=true; 
                    }
                    
                }else if(this.listProducto.get(0).getTipo()=="Drogueria"){
                    
                    if(p.getTipo()=="Drogueria"|| p.getTipo()=="Higiene"){
                            this.listProducto.add(p);
                            this.espacioDisponible=this.espacioDisponible-p.getVolumen();
                            cad=true; 
                    }
                    
                }else if(this.listProducto.get(0).getTipo()=="Mascotas"){
                    
                    if(p.getTipo()=="Mascotas"){
                            this.listProducto.add(p);
                            this.espacioDisponible=this.espacioDisponible-p.getVolumen();
                            cad=true; 
                    }
                    
                }
              }
            }else{
                this.listProducto.add(p);
                this.espacioDisponible=this.espacioDisponible-p.getVolumen();
                cad=true;        
            }
        return cad;
    }
    
    public String imprimirProductos(){
      String cad="";
      for(int i=0;i<this.listProducto.size();i++){
           cad+=this.listProducto.get(i).getNombre()+",";
      }
      return cad;
    }
    
    
    private int calcularVolumen(int ancho, int alto, int largo){
        int c=0;
        c=ancho*alto*largo;
        return c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getEspacioDisponible() {
        return espacioDisponible;
    }

    public void setEspacioDisponible(int espacioDisponible) {
        this.espacioDisponible = espacioDisponible;
    }

    void agregarProducto(String papel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
