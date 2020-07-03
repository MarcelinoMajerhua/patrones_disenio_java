
package composite;

public class EmpresaSinFilial extends Empresa{

    @Override
    public double calcularCosteMantenimiento() {
        return nVehiculos*costeUnitarioVehiculo;
    }

    @Override
    public boolean agregarFilial(Empresa filial) {
        return false;
    }
    
}
