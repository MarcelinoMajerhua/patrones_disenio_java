
package builder;


public class Vendedor {
    protected ConstructorDocumentacionVehiculo constructor;
    
    public Vendedor (ConstructorDocumentacionVehiculo constructor){
        this.constructor= constructor;
        
    };
    
    public Documentacion  construye(String nombreCliente){
        constructor.construirSolicitudPedido(nombreCliente);
        constructor.construirSolicitudMatricula(nombreCliente);
        
        Documentacion documentcion = constructor.resultado();
        return documentcion;
    };
}
