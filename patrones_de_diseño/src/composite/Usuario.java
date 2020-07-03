
package composite;

public class Usuario {
    public static void main(String[] arg){
        Empresa empresa1 = new EmpresaSinFilial();
        empresa1.agregarVehiculos();
        Empresa empresa2 = new EmpresaSinFilial();
        empresa2.agregarVehiculos();
        empresa2.agregarVehiculos();
        Empresa grupo = new EmpresaMadre();
        
        grupo.agregarFilial(empresa1);
        grupo.agregarFilial(empresa2);
        
        grupo.agregarVehiculos();
        
        System.out.println("Coste de mantenimiento total del grupo: "+
                grupo.calcularCosteMantenimiento());
    
    }
    
    
}
