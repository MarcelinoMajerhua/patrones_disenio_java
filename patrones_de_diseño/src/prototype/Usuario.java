package prototype;

public class Usuario {
    public static void main(String[] arg){

        //inicializacion documento en blanco
        DocumentacionEnBlaco documentoEnBlanco = DocumentacionEnBlaco.Instance();
        documentoEnBlanco.incluye(new OrdenPedido());
        documentoEnBlanco.incluye(new CertificadoCesion());
        documentoEnBlanco.incluye(new SolicitudMatriculacion());
        // creacion  de documentacion nueva para los cli3ntes

        DocumentacionCliente documentacionCliente = new DocumentacionCliente("Martin");
        DocumentacionCliente documentacionCliente1 = new DocumentacionCliente("simon");
        documentacionCliente.visualiza();
        documentacionCliente1.visualiza();

    }
}
