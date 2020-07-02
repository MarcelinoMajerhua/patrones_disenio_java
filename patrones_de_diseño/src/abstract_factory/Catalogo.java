
package abstract_factory;

import java.util.Scanner;


public class Catalogo {
    public static int numero_autos=3;
    public static int numero_scooter=2;
    
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        FabricaVehiculo fabrica;
        Automovil[] autos = new Automovil[numero_autos];
        Scooter[] scooters = new Scooter[numero_scooter];
        System.out.println("Desea utilizar vehiculos: 1)Electricos 2)Combustible");
        String eleccion = reader.next();
        
        if(eleccion.equals("1")){
            fabrica = new FabricaVehiculoElectrico();
        }else{
            fabrica = new FabricaVehiculoCombustible();
        };
        for (int i = 0; i < numero_autos; i++) {
            autos[i]= fabrica.crearAutomovil("Estandar", "Amarillo", 12+i, 12.1);
        }
        for (int i = 0; i < numero_scooter; i++) {
            scooters[i]=fabrica.crearScooter("EstandarS", "Rojo", i+200);
        }
        //leer datos
        for(Automovil auto: autos){
            auto.mostrarCaracteristicas();
        };
        for(Scooter scooter: scooters){
            scooter.mostrarCaracteristica();
        };

    }
}
