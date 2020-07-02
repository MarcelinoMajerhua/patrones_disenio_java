package prototype;

import java.util.ArrayList;

public class DocumentacionEnBlaco extends Documentacion{
    private static DocumentacionEnBlaco _instance = null;

    private DocumentacionEnBlaco (){

        documentos = new ArrayList<Documento>();
    }
    public static DocumentacionEnBlaco Instance(){
        if(_instance== null){
            _instance = new DocumentacionEnBlaco();
        }
        return _instance;
    }
    public void incluye(Documento doc){
        documentos.add(doc);

    }
    public void excluye(Documento doc){
        documentos.remove(doc);
    }
}
