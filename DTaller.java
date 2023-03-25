public class Dtaller{

    public static void main(String[] args) {
        Taller taller;//
        Factura factura;//
        Vehiculo vehiculo;//
        Propietario propietario;//
        taller = new Taller();
        factura = new Factura();
        vehiculo = new Vehiculo();
        propietario = new Propietario();

        
        taller.leer();
        taller.imprimir();
        factura.leer();
        factura.imprimir();
        vehiculo.leer();
        vehiculo.imprimir();
        propietario.leer();
        propietario.imprimir();
    }
}