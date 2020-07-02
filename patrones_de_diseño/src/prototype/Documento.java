package prototype;

public abstract class Documento implements Cloneable {
    protected String contenido;

    public Documento duplicate(){
        Documento resultado;

        try {
            resultado = (Documento)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        return resultado;

    }
    public void rellenar(String informacion){
        contenido = informacion;
    }
    public abstract void imprime();
    public abstract void visualiza();
}
