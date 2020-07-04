
package decorator;

public class MarcaDecorador extends Decorador{
    
    public MarcaDecorador(ComponenteGraficoVehiculo componente) {
        super(componente);
    }
    
    protected void visulizaLogo(){
        System.out.println("Logotipo de la marca");
    }

    public void visualiza(){
        super.visualiza();
        this.visulizaLogo();
    }
    
}
