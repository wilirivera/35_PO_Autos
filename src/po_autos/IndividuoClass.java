/*
 * Clase Static y Contador
 */
package po_autos;

public class IndividuoClass {
    
    // CREAR ATRIBUTOS de la clase IndividuoClass
    private String nombre;
    private int idPersona;
    private static int contadorPersona=0;
    
    // CREACION DEL CONSTRUCTOR
    public IndividuoClass (String nombre){
        
        contadorPersona ++;
        idPersona = contadorPersona;
        this.nombre = nombre;
        
    }// end constructor
    
    // CREACION DE LOS METODOS
    // Obtener conteo actual de contador
    public static int getContadordePersonas (){
        
        return contadorPersona;
        
    }// end metodo
    
    
    
    
    
        
    
    
    
}
