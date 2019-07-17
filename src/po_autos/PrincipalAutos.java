/*
 * Pricipal Clase autos. para crear y modificar  objetos
 */
package po_autos;

public class PrincipalAutos {

    public static void main(String[] args) {
        
        //Declarar e inicializar Objeto. Crear Objeto
        Autos vehiculo_1 = new Autos("abd123", "2019");
        
        // Carga de Atributos Directos del objeto a Crear
        vehiculo_1.marca = "Mazda";
        vehiculo_1.color = "rojo";
        
        //Cargar atributos adicionales de movimiento. velocidad y Aceleracion. metodo set 
        vehiculo_1.setMovimiento(110, 20,5);
        
      
    
        // mostrar informacion_Objeto_1
        
        //test
        System.out.println(vehiculo_1.test + "\n");
        
        //mostrar Caractaristicas Basicas
        System.out.println("el vehiculo es de marca: " + vehiculo_1.marca);
        
        System.out.println("el vehiculo es de color: " + vehiculo_1.color);
        
        System.out.println("el vehiculo es de Modelo: " + vehiculo_1.modelo);
        
        System.out.println("el vehiculo es de Matricula: " + vehiculo_1.matricula + "\n");
        
    
        
        //mostrar endendido
        vehiculo_1.encender();
        
        //mostrar apagado
        vehiculo_1.apagar();
        
        // mostrar Encendido nuevamente
        vehiculo_1.reEncender();
        
        // Obtener movimiento
        vehiculo_1.getMovimiento();
        
        // Disminuir velocidad
        vehiculo_1.ReducirVelocidad();
        
        // Obtener luces
        vehiculo_1.luzActiva();
        
        
        
       
    }// end main
    
}// end Public Cass
