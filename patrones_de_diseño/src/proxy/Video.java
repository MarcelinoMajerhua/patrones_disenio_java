
package proxy;

public class Video implements Animacion{

    @Override
    public void dibuja() {
        
    }

    @Override
    public void clic() {
        System.out.println("Mostrar el video");
    }
    
    public void carga(){
        System.out.println("Carga el video");
    }
    public void reproduce(){
        System.out.println("Reproducir el video");
    
    }
    
}
