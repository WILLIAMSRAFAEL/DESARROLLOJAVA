import.java.lang.*;
/*
 * 
 */

public class taller{
    private String Nombre;
    private int Numero;
    private String Fecha;

    public taller(){
        Nombre="";
        Numero=0;
        Fecha="";
    }
/*
 * 
 */
    public void leer(){
        //TODO: INGRESAR DATOS DEL TALLER
    }
    public void imprimir(){
        //TODO: MOSTRAR LOS DATOS DEL TALLER
    }
/*
 * 
 */
    public String getNombre(){
        if(Nombre="")
        return "error no tiene nombre";
        else
        return Nombre;
    }
/*
 * 
 */
    public void setFecha(String fecha){
        this.Fecha = Fecha;
    }
}