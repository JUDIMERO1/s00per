
package Bussines;


public class Producto {
    String nombre;
    int precio;
    int temperatura;
    String caducidad;
    int volumen;
    int peso;
    String tipo;

    public Producto(String nombre, int precio, int temperatura, String caducidad, int volumen, int peso, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.temperatura = temperatura;
        this.caducidad = caducidad;
        this.volumen = volumen;
        this.peso = peso;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
