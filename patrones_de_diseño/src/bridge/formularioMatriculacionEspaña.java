
package bridge;

public class formularioMatriculacionEspaña extends FormularioMatriculacion{

    public formularioMatriculacionEspaña(FormularioImpl implementacio) {
        super(implementacio);
    }

    @Override
    protected boolean controlZona(String matricula) {
        return matricula.length()==7;
    }
    
}
