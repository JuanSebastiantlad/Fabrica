package fabrica;

import java.util.Date;

public class Fabrica {

    private String nombre; //Nombre de la fabrica//
    private int numeroDeTrabajadores;/* la cantidad de trabajadores que tiene*/
    private Date fechaDeFundacion; //Cuando fue fundada la fabrica//
    private String especialidad; //En que productos se especializa mi fabrica//
    private Boolean internacional;//Mi empresa puede exportar sus productos//

    public Fabrica(
            String nombre, 
            int numeroDeTrabajadores, 
            Date fechaDeFundacion, 
            String especialidad, 
            Boolean internacional) {
        this.nombre = nombre;
        this.numeroDeTrabajadores = numeroDeTrabajadores;
        this.fechaDeFundacion = fechaDeFundacion;
        this.especialidad = especialidad;
        this.internacional = internacional;
    }
    /*Mi metodo tiene la capacidad para contratar y aumentar el numero
    de trabajadores en 50 y la convierte en internacional*/
    public void contrataTrabajadores(){
      this.numeroDeTrabajadores += 50;
      this.internacional = true;
    }
    
    //Este metodo me permite cambiar la especializacion de mi fabrica//
    public void reinaguracion(
            String nuevoNombre,
            String nuevaEspecialidad){
      this.nombre = nuevoNombre;
      this.especialidad = nuevaEspecialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeTrabajadores() {
        return numeroDeTrabajadores;
    }

    public void setNumeroDeTrabajadores(int numeroDeTrabajadores) {
        this.numeroDeTrabajadores = numeroDeTrabajadores;
    }

    public Date getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public void setFechaDeFundacion(Date fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getInternacional() {
        return internacional;
    }

    public void setInternacional(Boolean internacional) {
        this.internacional = internacional;
    }
   
    
    
    public static void main(String[] args) {
      Fabrica fabricaUno = new Fabrica (
              "Colombia Motors",
              150,
              new Date(),
              "Automoviles",
              true);
      Fabrica fabricaDos = new Fabrica("Grucci",
      30,
      new Date(),
      "Ropa",
      false);
      
        System.out.println(fabricaUno.getNombre());
        System.out.println(fabricaUno.getNumeroDeTrabajadores());
        System.out.println(fabricaUno.getInternacional());
        
        fabricaUno.contrataTrabajadores();
        
        System.out.println(fabricaUno.getNombre());
        System.out.println(fabricaUno.getNumeroDeTrabajadores());
        System.out.println(fabricaUno.getInternacional());
        
        System.out.println(fabricaDos.getNombre());
        System.out.println(fabricaDos.getNumeroDeTrabajadores());
        System.out.println(fabricaDos.getInternacional());
        
        fabricaDos.contrataTrabajadores();
        
        System.out.println(fabricaDos.getNombre());
        System.out.println(fabricaDos.getNumeroDeTrabajadores());
        System.out.println(fabricaDos.getInternacional());
       
    }
    
}
