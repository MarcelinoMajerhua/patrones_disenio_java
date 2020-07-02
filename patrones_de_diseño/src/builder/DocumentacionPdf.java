
package builder;


public class DocumentacionPdf extends Documentacion{

    @Override
    public void agregarDocumento(String documento) {
        if(documento.startsWith("<PDF>")){
            contenido.add(documento);
        };
    }

    @Override
    public void imprime() {
        System.out.println("Documento PDF");
        for(String s: contenido){
            System.err.println(s);
        };
    }
    
}
