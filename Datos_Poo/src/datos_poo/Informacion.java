package datos_poo;
/**
 *
 * @author Gigdem
 */
public class Informacion {
   String nombre; 
   String Carrera; 
   int Semestre; 
   
   public Informacion (String nombre, String Carrera, int Semestre){
     this.nombre = nombre; 
     this.Carrera = Carrera; 
     this.Semestre = Semestre; 
   
   }
   
   public String getNombre (){
    return " El nombre es: " + nombre;
   }
   
   public void setNombre (String nombre){
   this.nombre = nombre; 
   }
   
   public String getCarrera (){
   return " La carrera es: " + Carrera;
   }
   
   public String getSemestre (){
   return " El semestre es: " + Semestre;
   }
   
   public void setSemestre (int Semestre){
   this.Semestre = Semestre; 
   }
}
