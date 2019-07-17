/*
 Ejercicio para entender modificadores de clase y metodos. Esta es la clase
 */
package po_autos;

public class PersonaClass {
    
    // crear atributos de la clase PersonaClass
    public String nombre = "juan";
    public static int camina; //se usa modificador de metodo static y visibilidad public
                              // Con static indicamos que No es necesario crear un objeto de la clase para poder acceder a estos atributos   
                              // con Static tambien queremos generar elementos que tomen un mismo valor para cualquier número de instancias que se creen  
                              // Static es similar a un valor constante.          
}// end Class
