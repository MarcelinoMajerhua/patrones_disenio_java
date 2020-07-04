
package flyweight;


public class OpcionVehiculo {
    protected String nombre;
    protected String description;
    protected int precioEstandar;

    public OpcionVehiculo(String nombre) {
        this.nombre = nombre;
        this.description = "Descripcion de "+nombre;
        this.precioEstandar = 100;
    }
    public void visualiza(int precioDeVenta){
        System.out.println("Opcion");
        System.out.println("Nombre: "+nombre);
        System.out.println(description);
        System.out.println("Precio estandar: "+precioEstandar);
        System.out.println("Precio de venta: "+precioDeVenta);
    }
    
    
}
