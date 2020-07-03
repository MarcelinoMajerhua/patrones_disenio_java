
package bridge;

public class FormularioMatriculacionProtugal extends FormularioMatriculacion{

    public FormularioMatriculacionProtugal(FormularioImpl implementacio) {
        super(implementacio);
    }

    @Override
    protected boolean controlZona(String matricula) {
        return matricula.length()==6;
    }
    
}
