//
package Model;

public class Domicilio extends Vendedorm{
    
    private String Direccion;
    
    public Domicilio(String nombre, String NumDocumento, String ID, String Telefono, String Direccion) {
        super(nombre, NumDocumento, ID, Telefono);
        this.Direccion = Direccion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
}
