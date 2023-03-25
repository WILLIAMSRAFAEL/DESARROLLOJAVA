import java.lang.*;
/*
 * 
 */
public class Factura{
    private String Fecha;
    private int Numero;
    private String Impite;
/*
 * 
 */
    public Factura(){
        Fecha="";
        Numero=0;
        Impite="";
    }
    /*
     * 
    */
    public void leer(){
        //TODO: INGRESAR DATOS DEL LA FACTURA
    }
    /*
     * 
     */
    public void imprimir(){
        //TODO: MOSTRAR LOS DATOS DEL FACTURA
    }
    /*
     * 
     */
    public int getNumero(){
        if(Numero=0)
        return "ERROR LA FACTURA NO EXISTE";
        else
        return Numero;
    }
    /*
     * 
     */
    public void setFecha(String fecha){
        this.Fecha = Fecha;
    }
}