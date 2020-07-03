
package composite;

public abstract class Empresa {
    protected static double costeUnitarioVehiculo=5.0;
    
    protected int nVehiculos;
    
    public void agregarVehiculos(){
        nVehiculos++;
    }
    
    public abstract double calcularCosteMantenimiento();
    
    public abstract boolean agregarFilial(Empresa filial);
}
