
package abstract_factory;

public class ScooterElectricidad extends Scooter {
    public ScooterElectricidad(String modelo, String color, int potencia){
        super(modelo, color, potencia);
    };
    @Override
    public void mostrarCaracteristica() {
        System.out.println("Scooter electricidad modelo: " + modelo +
                " color: "+color +" potencia: "+potencia);
    }
    
}
