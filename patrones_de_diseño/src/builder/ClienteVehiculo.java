
package builder;

import java.util.Scanner;


public class ClienteVehiculo {
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
    
         ConstructorDocumentacionVehiculo constructor;
         
         System.out.println("HTML (1)  PDF (2)");
         
         String seleccion = reader.next();
         
         if(seleccion.equals("1")){
            constructor = new ConstructorDocumentacionVehiculoHtml();
            
         }else{
             constructor = new ConstructorDocumentacionVehiculoPdf();
         };
         
         Vendedor vendedor = new Vendedor(constructor);
         
         Documentacion documentacion = vendedor.construye("Marcelino");
         documentacion.imprime();
    
    }
}
