
package facade;

import java.util.List;

public interface WebServiceAuto {
    String documento(int indice);
    List<String> buscarVehiculo(int precioMedio,int desviacion);
}
