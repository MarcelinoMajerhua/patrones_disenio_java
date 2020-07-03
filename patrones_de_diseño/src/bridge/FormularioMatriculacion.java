
package bridge;

public abstract class FormularioMatriculacion {
    protected String contenido;
    protected FormularioImpl implementacion;
    
    public FormularioMatriculacion(FormularioImpl implementacio){
        this.implementacion=implementacio;
    }
    
    public void visualiza(){
        implementacion.dibujarText("numero de matricula existe: ");
    }
    public void generarDocumento(){
        implementacion.dibujarText("Solicitud de matriculacion");
        implementacion.dibujarText("numero de matricula: "+contenido);
    }
    public boolean administraZona(){
        contenido = implementacion.administrarZonaIndicada();
        return this.controlZona(contenido);
    }
    protected abstract boolean controlZona(String matricula);
}
