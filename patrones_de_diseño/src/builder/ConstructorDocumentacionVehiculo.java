
package builder;


public abstract class ConstructorDocumentacionVehiculo {
    protected Documentacion documentacion;
    
    public abstract void construirSolicitudPedido(String nombreCliente);
    public abstract void construirSolicitudMatricula(String nombreSolicitante);
    
    public Documentacion resultado(){
        return documentacion;
    };
}
