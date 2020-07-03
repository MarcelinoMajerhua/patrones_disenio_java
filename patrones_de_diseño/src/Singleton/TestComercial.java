package Singleton;

public class TestComercial {
	public static void main(String[] arg) {
		//inicializaci�n del comercial en el sistema
		
		Comercial elComercial = Comercial.Instance();
		
		elComercial.setNombre("Marcelino");
		elComercial.setDireccion("Jr direccion");
		elComercial.setEmail("marcelino.majerhua@gmail.com");
		
		//mostrar el comercial

		visualiza();

		
	}

	public static void visualiza() {
		Comercial elComercial1 = Comercial.Instance();
		elComercial1.visualiza();
	}
	
}
