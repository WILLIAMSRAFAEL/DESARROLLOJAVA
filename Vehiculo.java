import.java.lang.*;

 /*
  * 
  */
  public class Vehiculo{
    private String Marca;
    private String Modelo;
    private int Placa;

    /*
     * 
     */
    public Vehiculo(){
        Marca = "";
        Modelo = "";
        Placa = 0;
    }
        /*
     * 
    */
    public void leer(){
        //TODO: INGRESAR DATOS DEL VEHICULO
    }
    /*
     * 
     */
    public void imprimir(){
        //TODO: MOSTRAR LOS DATOS DEL VEHICULO
    }
    /*
     * 
     */
    public int getPlaca(){
        if(Placa=0)
        return "ERROR EL VEHICULO NO EXISTE";
        else
        return Placa;
    }
  }