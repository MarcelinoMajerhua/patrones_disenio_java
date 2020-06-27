
package abstract_factory;


public class FabricaVehiculoCombustible implements FabricaVehiculo{

    @Override
    public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilCombustible(modelo,color,potencia,espacio);
    }

    @Override
    public Scooter crearScooter(String modelo, String color, int potencia) {
        return new ScooterCombustible(modelo, color, potencia);
    }
    
}
