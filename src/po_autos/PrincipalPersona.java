/*
 * Ejercicio para entender modificadores de clase y metodos. Este es el principal.
 */
package po_autos;

public class PrincipalPersona {

    public static void main(String[] args) {
        
        System.out.println("1-Se tiene Distancia: "
                + PersonaClass.camina);
        
        
        PersonaClass.camina = 50;
        
        
        System.out.println("2-Se tiene Nueva Distancia: " 
                + PersonaClass.camina); // Camina es atributo public puedo ingrear directo al atributo o por constructor
        
        // Crear objetos persona_1
        PersonaClass perso_1 = new PersonaClass();
        PersonaClass perso_2 = new PersonaClass();
        
        perso_1.nombre = "FIDEL";
        perso_1.camina = 10; // camina es un atrubito static (constante para varios objetos) y le estamos haciendo una nueva asignacion, por eso el warning 
        
        System.out.println("3-Se tiene Nombre Objeto: " + perso_1.nombre);
        System.out.println("3-Se tiene Distancia Objeto: " + perso_1.camina);
        
        perso_2.nombre = "Carlos";
        perso_2.camina = 20;
        
         System.out.println("4-Se tiene Nombre Nuevo Objeto: " + perso_2.nombre);
         System.out.println("4-Se tiene Distancia Nuevo Objeto: " + perso_2.camina);
      
    }// End metodo main
    
}// End class main 
