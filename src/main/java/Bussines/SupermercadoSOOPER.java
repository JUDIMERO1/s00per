/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bussines;

import java.util.ArrayList;

/**
 *
 * @author CamiloN
 */
public class SupermercadoSOOPER {
  ArrayList<Producto> listProducto;
  ArrayList<Contenedor> listContenedor;

    public SupermercadoSOOPER() {
        this.listProducto = new ArrayList ();
        this.listContenedor = new ArrayList ();
    }
    //metodo para probar el embolsar
    //crea productos que puedan ser embosados
    public void generarProductos(){
        this.agregarListProducto("harina", 5000, 0, "ninguna", 10, 500, "Alimentacion");
        this.agregarListProducto("Arroz", 4500, 0, "ninguna", 10, 1000, "Alimentacion");
        this.agregarListProducto("jabon", 3000, 0, "ninguna", 3, 250, "Higiene");
        this.agregarListProducto("correa", 20000, 0, "ninguna", 20, 1000, "Mascotas");
        this.agregarListProducto("naranja", 100, 0, "ninguna", 5, 250, "Alimentacion");
        this.agregarListProducto("acetaminofen", 500, 0, "ninguna", 1, 100, "Drogueria");
        this.agregarListProducto("cepillo", 3500, 0, "ninguna", 3, 100, "Higiene");
        this.agregarListProducto("shampoo", 7000, 0, "ninguna", 15, 1000, "Higiene");
        this.agregarListProducto("huevo", 700, 0, "ninguna", 3, 200, "Alimentacion");
        this.agregarListProducto("pastilla", 300, 0, "ninguna", 1, 100, "Drogueria");
    }
    
    public void agregarListProducto(String nombre, int precio, int temperatura, String caducidad, int volumen, int peso, String tipo){

        Producto p=new Producto(nombre, precio, temperatura,caducidad, volumen, peso, tipo);
        this.listProducto.add(p);

    }
    //crea contenedores que puedan ser usados para embolsar
    public void generarContenedor(){
        this.agregarListContenedor("bolsa", 2, 2, 2, "pequena",300,"");
        this.agregarListContenedor("bolsa", 4, 4, 4, "mediana",600,"");
        this.agregarListContenedor("bolsa", 8, 8, 8, "grande",900,"");
        this.agregarListContenedor("caja", 2, 2, 2, "",0,"rectangulo");
    }
    
    public void agregarListContenedor(String nombre, int ancho, int alto, int largo, String tamano, int resistenciaMax, String forma){
        Contenedor c; 
        if(resistenciaMax!=0){
            c= new Bolsa(nombre, ancho,  alto,  largo,  tamano, resistenciaMax);
        }else{
            c= new Caja(nombre, ancho,  alto,  largo,  tamano, forma);
        }
        this.listContenedor.add(c);
    }
    
  public String empacarProductos(){
      String cad="";
        ArrayList<Producto> listContProducto=null;
        ArrayList<Producto> listAlimento=null;
        ArrayList<Producto> listHigiene=null;
        ArrayList<Producto> listDrogueria=null;
        ArrayList<Producto> listMascota=null;
      
      for(int i=0;i<this.listProducto.size();i++){
          
          if(this.listProducto.get(i).getTipo().equals("Alimentacion")){
              if(listAlimento==null){
                  listAlimento=new ArrayList();
                  listAlimento.add(this.listProducto.get(i));
              }
          }else if(this.listProducto.get(i).getTipo().equals("Higiene")){
              if(listAlimento==null){
                  listHigiene=new ArrayList();
                  listHigiene.add(this.listProducto.get(i));
              }
          }else if(this.listProducto.get(i).getTipo().equals("Drogueria")){
              if(listAlimento==null){
                  listDrogueria=new ArrayList();
                  listDrogueria.add(this.listProducto.get(i));
              }
          }else if(this.listProducto.get(i).getTipo().equals("Mascota")){
              if(listAlimento==null){
                  listMascota=new ArrayList();
                  listMascota.add(this.listProducto.get(i));
              }
          }else{
              
          }
      }
      
      if(listAlimento!=null){
        for(int i=0;i<listAlimento.size();i++){
            int cont=0;
            Contenedor c=this.listContenedor.get(cont);
            Boolean resp=c.agregarProducto(listAlimento.get(i));
                  if(!resp){
                      cont++;
                      c=this.listContenedor.get(cont);
                      resp=c.agregarProducto(listAlimento.get(i));
                  }else{
                      
                  } 
        }
      }
      return cad;
  }
  

  
  public String imprimirContenedores(){
      String cad="";
      for(int i=0;i<this.listContenedor.size();i++){
          cad+=this.listContenedor.get(i).getNombre()+": \n";
          cad+=this.listContenedor.get(i).imprimirProductos()+": \n\n";
      }
      return cad;
  }
    
    public String imprimirListadoProductos(){
      String cad="";
      for(int i=0;i<this.listProducto.size();i++){
          cad+=this.listProducto.get(i).getNombre()+"\n";
      }
      return cad;
  }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//        
//        
//        
//        
//    }
    
}
