
package facade;

import java.util.List;


public class UsuarioWebService {
    public static void main(String[] args){
        WebServiceAuto webServiceAuto = new WebServiceAutoImpl();
        System.out.println(webServiceAuto.documento(0));
        System.out.println(webServiceAuto.documento(1));
        
        List<String> resultados = webServiceAuto.buscarVehiculo(6000, 1000);
        if(resultados.size()>0){
            System.out.println("Vehiculo(s) cuyo precio están comprendido "+
                    "entre 5000 y 7000");
            for(String resultado: resultados){
                System.out.println(" "+resultado);
            }
        }
    }
}
