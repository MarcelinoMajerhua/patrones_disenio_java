package prototype;

public class CertificadoCesion extends Documento {
    @Override
    public void imprime() {
        System.out.println("Imprime la certificacion de Cesion: "
        +contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("Visualiza la certificacion de cesion: "+contenido);
    }
}
