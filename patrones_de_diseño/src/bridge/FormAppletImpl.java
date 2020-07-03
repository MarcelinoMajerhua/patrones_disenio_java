
package bridge;

import java.util.Scanner;

public class FormAppletImpl implements FormularioImpl {
    Scanner reader = new Scanner(System.in);
    @Override
    public void dibujarText(String texto) {
        System.out.println("Applet: "+texto);
    }

    @Override
    public String administrarZonaIndicada() {
        return reader.next();
    }
    
}
