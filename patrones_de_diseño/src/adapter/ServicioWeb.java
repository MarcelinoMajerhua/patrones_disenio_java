
package adapter;

public class ServicioWeb {
    public static void main(String[] arg){
        Documento documento1, documento2;
        
        documento1= new DocumentoHtml();
        documento1.setContenido("Hello");
        documento1.dibuja();
        System.err.println("---------------------");
        documento2 = new DocumentoPdf();
        documento2.setContenido("Hola");
        documento2.dibuja();
    }
}
