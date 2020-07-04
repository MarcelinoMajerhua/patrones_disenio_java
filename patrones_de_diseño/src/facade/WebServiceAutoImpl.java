
package facade;

import java.util.List;

public class WebServiceAutoImpl implements WebServiceAuto{
    protected Catalogo catalogo = new ComponenteCatalogo();
    protected GestionDocumento gestionDocumento = new ComponenteGestionDocumento();
    
    @Override
    public String documento(int indice){
        return gestionDocumento.documento(indice);
    }

    @Override
    public List<String> buscarVehiculo(int precioMedio, int desviacion) {
        return catalogo.buscaVehiculos(precioMedio-desviacion, precioMedio+desviacion);
    }
    
}
