
package po_autos;

public class PrincipalAuto {
    

    public static void main(String[] args) {
        
        Vehiculo auto1 = new Vehiculo("AZ1456", "Ford Fiesta");
        auto1.color = "rojo";
        //auto1.marca = "ford";
        System.out.println(auto1.color);
        
        // Mostrar Datos del auto
        auto1.encender();
        
 
    }// end main Class
    
}// end Public Class
