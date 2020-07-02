
package builder;

public class ConstructorDocumentacionVehiculoHtml extends  ConstructorDocumentacionVehiculo{
    public ConstructorDocumentacionVehiculoHtml(){
        documentacion = new DocumentacionHtml();
    };
    @Override
    public void construirSolicitudPedido(String nombreCliente) {
        String documento = "<HTML> Solicitud de pedido cliente: "+nombreCliente+" </HTML>";
        documentacion.agregarDocumento(documento);
    }

    @Override
    public void construirSolicitudMatricula(String nombreSolicitante) {
        String documento = "<HTML>Solicitud de matricula: "+nombreSolicitante+" </HTML>";
        documentacion.agregarDocumento(documento);
    }
    
}
