
package flyweight;

public class Cliente {
    public static void main(String[] args){
        FabricaOpcion fabrica = new FabricaOpcion();
        
        VehiculoSolicitado vehivulo = new VehiculoSolicitado();
        
        vehivulo.AgregarOpciones("air bag", 80, fabrica);
        vehivulo.AgregarOpciones("direccion asistida", 90, fabrica);
        vehivulo.AgregarOpciones("elevalunas electrico", 85, fabrica);
        
        vehivulo.muestraOpcion();
    }
}
