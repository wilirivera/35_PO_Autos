/*
 * Clase Vehiculo
Dudas:
como es el tema de inicializar variable aca. por que ya no
el contador siempre debe ser en static
 */
package po_autos;

public class Autos {
    
    // ATRIBUTOS.Crear Atributos clase Autos
    public String marca;
    public String modelo;
    public int antiguedad;
    public String color;
    public int velocidadInicial;
    public int velocidadActual;
    public int velocidadfinal;
    public int aceleracion;
    public boolean encendido;
    public String matricula;
    public boolean luces;
    public boolean test;
    
    // CONSTRUCTOR. Creación del constructor de la clase Autos
    Autos (String placa, String modelo){
        this.matricula = placa;
        this.modelo = modelo;   
    }// end constructor autos
    
    // METODOS. Crear metodos de la clase autos
    //1-Obtener marca Auto
    public String getMarca(){

        return this.marca;
        
    }// end metodo getMarca
    
    // 2-Modificar el atributoMarca
    public void setMarca(String marca){
      
        this.marca = marca;
        
    }//end setMarca
    
    //3-Encender Vehiculo
    public void encender(){
        
        //su esta apagado   
        if(this.encendido == false){
            
            this.encendido = true;
            // Mostra resultado
            System.out.println("el vehiculo "+this.marca + " " + this.modelo + " " + " Se Esta Encendiendo");
            
        }//endif 
            
    }// end metodo encender
    
    //4-Apagar Vehiculo
    public void apagar(){
        
        // estando encendido
        if (this.encendido == true){
            
            // Mostra resultado
            System.out.println("el vehiculo "+this.marca + " " + this.modelo + " " + " se esta apagando");
            
        } else {
            
            this.encendido = false;
            // Mostra resultado
            System.out.println("el vehiculo "+this.marca + " " + this.modelo + " " + " ya esta apagando");
            
        }// End if
        
    }//end Apagar
    
    
    //5-Re_Encendido
    public void reEncender(){
        
        if (this.encendido == true){
            this.encendido = false;
            // Mostra resultado
            System.out.println("el vehiculo "+this.marca + " " + this.modelo + " " + " se esta Encendiendo Nuevamente y se Mueve \n");
            
        }//end if       
        
    }//fin reencender
    
    
    
    //6-Ajustar movimiento
    public  void setMovimiento(int velActual, int aceleracion){
        this.velocidadActual = velActual;
        this.aceleracion = aceleracion;
        this.velocidadfinal = (this.velocidadInicial + this.velocidadActual + this.aceleracion); 
    }// end get velocidadAct

    
    //6-Acelerar vehiculo y obtener velocidad actual
     public  void getMovimiento(){
         
         // Mostra resultado
        System.out.println("el vehiculo "+this.marca + " " + this.modelo + " " + " tiene se esta moviendo asi: " + "\n");
        System.out.println("inicio con velocidad de: " + this.velocidadInicial);
        System.out.println("alcanzo velocidad de: " + this.velocidadActual);
        System.out.println("Acelero a: " + this.aceleracion);
        System.out.println("esta moviendose ahora a: " + this.velocidadfinal + "\n");
  
     } // end get movimiento
    
    //7-Encender Luces
    public void luzActiva(){
        if (this.luces == false){
            this.luces = true;
   
            // Mostra resultado
            System.out.println("el vehiculo "+this.marca + " " + this.modelo + " " + " entra a Tunel. Se mueve con luces encendidadas");
        }//end if
        
    }//end set luces
    
    //8-Abrir puerta
    
    //9-reducir velocidad
    
    
    
    
    
    
    
    
}// end Class Autos
