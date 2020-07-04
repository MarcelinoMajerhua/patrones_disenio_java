
package decorator;

public class VistaCatalogo {
    public static void main(String[] args){
    
        ComponenteGraficoVehiculo vistaVehiculo = new VistaVehiculo();
        ComponenteGraficoVehiculo modeloDecorador = new ModeloDecorador(vistaVehiculo);
        ComponenteGraficoVehiculo marcaDecorador = new MarcaDecorador(modeloDecorador);
        marcaDecorador.visualiza();
    }
}
