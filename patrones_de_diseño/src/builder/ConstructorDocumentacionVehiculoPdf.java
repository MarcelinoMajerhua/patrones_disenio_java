
package builder;

public class ConstructorDocumentacionVehiculoPdf extends ConstructorDocumentacionVehiculo{
    public ConstructorDocumentacionVehiculoPdf(){
        documentacion = new DocumentacionPdf();
    }
    @Override
    public void construirSolicitudPedido(String nombreCliente) {
        String documento = "<PDF> Solicitud de pedido cliente: "+nombreCliente+" </PDF>";
        documentacion.agregarDocumento(documento);
    }

    @Override
    public void construirSolicitudMatricula(String nombreSolicitante) {
        String documento = "<PDF>Solicitud de matricula: "+nombreSolicitante+" </PDF>";
        documentacion.agregarDocumento(documento);
    }
    
}
