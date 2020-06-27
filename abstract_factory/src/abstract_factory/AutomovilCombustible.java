package abstract_factory;

public class AutomovilCombustible extends Automovil {

    public AutomovilCombustible(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }
    ;
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("El automovil es combustible: "
                + "modelo: " + modelo
                + " color: " + color
                + " potencia: " + potencia
                + " espacio: " + espacio);
    }
}
