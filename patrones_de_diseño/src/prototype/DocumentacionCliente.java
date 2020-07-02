package prototype;

import java.util.ArrayList;
import java.util.List;

public class DocumentacionCliente extends Documentacion{
 public DocumentacionCliente(String informacion){
     documentos = new ArrayList<Documento>();
     DocumentacionEnBlaco documentacionEnBlanco = DocumentacionEnBlaco.Instance();
     List<Documento> documentosEnBlanco = documentacionEnBlanco.getDocumento();

     for (Documento documento: documentosEnBlanco) {
         Documento copiaDocumento = documento.duplicate();
         copiaDocumento.rellenar(informacion);
         documentos.add(copiaDocumento);
     }

 }
 public void visualiza(){
     for (Documento documento: documentos) {
         documento.visualiza();
     }
 }
 public void imprime(){
     for (Documento documento: documentos) {
         documento.imprime();
     }
 }
}
