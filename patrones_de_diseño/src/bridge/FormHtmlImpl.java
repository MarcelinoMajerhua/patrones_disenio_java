
package bridge;

import java.util.Scanner;


public class FormHtmlImpl implements FormularioImpl{
    Scanner reader = new Scanner(System.in);
    
    @Override
    public void dibujarText(String texto) {
        System.out.println("HTML: "+texto);
    }

    @Override
    public String administrarZonaIndicada() {
        return reader.next();
    }
}
