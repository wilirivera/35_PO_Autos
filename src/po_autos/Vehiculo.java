
package po_autos;

// crear Clase
public class Vehiculo {
    
    // crear atributos de la clase vehiculo
    
    public String marca;
    public String modelo;
    public int antiguedad;
    public String color;
    public int velocidadActual;
    public boolean encendido;
    public String matricula;
    
    // creación del constructor Vehiculo
    Vehiculo (String placa, String modelo){
        
        this.matricula = placa;
        this.modelo = modelo;
        
    }// end method
    
    // crear metodo de la clase vehiculo para Encender Vehiculo
    public void encender (){
        // si esta apagado
        if (this.encendido == false){
            this.encendido = true;
       
        }// end if
        
        System.out.println("el vehiculo"+this.marca + " " + this.modelo + " " + " se esta encendiendo");
        
    }//end method
    
    // Obtener el valor del atributo marca
    public String getMarca (){
        
        return this.marca;
        
    }//end method
    
    // modificar el atributo
    public void encender (String marca){
        
        this.marca = marca;
        
    }//end method
    
    // Apagar
    public void apagar (String marca){
        
    }//end method
    
    // Velocidad actual
    
    
    // Estado Vehiculo
    
    
    //Acelerar Vehiculo
    
    
    // Abrir Puerta
    
    
    
    
    
    
}// Fin clase

