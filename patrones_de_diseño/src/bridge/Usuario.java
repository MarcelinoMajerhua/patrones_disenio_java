
package bridge;

public class Usuario {
    public static void main(String[] arg){
        FormularioMatriculacionProtugal formulario1 = new FormularioMatriculacionProtugal(new FormHtmlImpl());
        formulario1.visualiza();
        if(formulario1.administraZona()){
            formulario1.generarDocumento();
        }
        System.out.println();
        formularioMatriculacionEspaña formulario2 = new formularioMatriculacionEspaña(new FormAppletImpl());
        
        formulario2.visualiza();
        if(formulario2.administraZona()){
            formulario2.generarDocumento();
        }
    
    }
}
