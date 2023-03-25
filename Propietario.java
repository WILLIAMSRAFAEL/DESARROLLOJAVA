import.java.lang.*;
/*
 * 
 */
public class Propietario{
    private String Nombre;
    private String Apellido;
    private int Cedula_Identidad;

    public Propietario(){
        Nombre ="";
        Apellido="";
        Cedula_Identidad=0;
    }
    /*
     * 
     */
    public void leer(){
        //TODO: INGRESAR DATOS DEL PROPIETARIO
    }
    /*
     * 
     */
    public void imprimir(){
        //TODO: MOSTRAR LOS DATOS DEL PROPIETARIO
    }

    public void getCedula_Identidad(){
        if(Cedula_Identidad=0)
        return "ERROR NO EXISTE EL PROPIETARIO";
        else
        return Cedula_Identidad;
    }
}