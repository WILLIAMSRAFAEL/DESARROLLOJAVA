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
         // Crear un tipo de problema y un auto asociado
         TipoProblema tipoProblema = new TipoProblema("Motor");
         Auto auto = new Auto("Toyota", tipoProblema);
         
         // Crear un cliente con una categoría
         Cliente cliente = new Cliente("Juan", "oro");
         
         // Calcular el precio total con descuento
         double precioTotal = 1000.0;
         double descuento = cliente.getDescuento();
         double precioConDescuento = precioTotal - (precioTotal * descuento);
         
         // Imprimir el precio total y el precio con descuento
         System.out.println("Precio total: " + precioTotal);
         System.out.println("Descuento: " + (descuento * 100) + "%");
         System.out.println("Precio con descuento: " + precioConDescuento);

        
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