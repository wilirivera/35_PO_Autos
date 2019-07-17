/*
 * Princial de ejercicio contador individuo
 */
package po_autos;

public class PrincipalIndividuo {

    public static void main(String[] args) {
        
       // Declarar en inicializar objeto_1
        IndividuoClass persona1 = new IndividuoClass("juan");
        
        // Invocar contador Para objeto_1. 
        IndividuoClass.getContadordePersonas(); 
        
        // Mostrar en pantalla el estado del contador
        System.out.println(IndividuoClass.getContadordePersonas());
        
        // Declarar en inicializar objeto_2
        IndividuoClass persona2 = new IndividuoClass("fredo");
        
        // Invocar contador Para objeto_2
        IndividuoClass.getContadordePersonas();
        
        // Mostrar en pantalla el estado del contador
        System.out.println(IndividuoClass.getContadordePersonas());
           
    }// end main
    
}// end public class 
