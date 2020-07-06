
package chain_of_responsibility;

public class Modelo extends ObjetoBasico{
    protected String descripcion;
    protected String nombre;

    public Modelo(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    @Override
    protected String getDescripcion() {
        if(descripcion!=null){
            return "Modelo "+nombre+" : "+descripcion;
        }else{
            return null;
        }
    }
    
}
