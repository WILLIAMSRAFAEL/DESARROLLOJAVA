import.java.lang.*;
/*
 * 
 */
public class Propietario{
    private String Nombre;
    private String Apellido;
    private int Cedula_Identidad;
    private String categoria;

    public Propietario(){
        Nombre ="";
        Apellido="";
        Cedula_Identidad=0;
        categoria="";
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
    public String getNombre() {
        return this.nombre;
    }

    public String getCategoria() {
        return this.categoria;
    }
    public double getDescuento() {
        switch (this.categoria) {
            case "oro":
                return 0.1;
            case "plata":
                return 0.05;
            case "bronce":
                return 0.02;
            default:
                return 0.0;
        }
    }

}