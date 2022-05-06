
package datos_poo;
/**
 *
 * @author Gigdem
 */
public class Datos_Poo {

    public static void main(String[] args) {
     
        Informacion info = new Informacion (" Gigdem Paola ", " Sistemas ", 3);
        //Encapsulamiento 
        String NumCon = info.getNombre () + " " + info.getCarrera () + info.getSemestre ();
        System.out.println("\nDatos generales alumno(a) : " + NumCon);
    }
    
}
