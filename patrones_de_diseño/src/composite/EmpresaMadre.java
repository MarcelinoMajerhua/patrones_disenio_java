
package composite;

import java.util.ArrayList;
import java.util.List;

public class EmpresaMadre extends Empresa{
    protected List<Empresa> filiales = new ArrayList<Empresa>();

    @Override
    public double calcularCosteMantenimiento() {
        double coste= 0.0;
        for(Empresa filial: filiales){
            coste  = coste +filial.calcularCosteMantenimiento();
        }
        return coste + nVehiculos*costeUnitarioVehiculo;
    }   

    @Override
    public boolean agregarFilial(Empresa filial) {
        return filiales.add(filial);
    }
}
