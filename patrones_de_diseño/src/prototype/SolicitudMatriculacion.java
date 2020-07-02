package prototype;

public class SolicitudMatriculacion extends Documento{
    @Override
    public void imprime() {
        System.out.println("Imprime la solicitud de matriculacion: "+contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("Visualiza la solicitud de matriculacion: "+contenido);
    }
}
