
package abstract_factory;

public class ScooterCombustible extends Scooter{
    public ScooterCombustible(String modelo, String color, int potencia){
        super(modelo, color, potencia);
    };
    @Override
    public void mostrarCaracteristica() {
        System.out.println("Scooter combustible modelo: " + modelo +
                " color: "+color +" potencia: "+potencia);
    }
    
}
