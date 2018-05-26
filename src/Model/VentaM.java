package Model;

import Controller.VentaController;

public class VentaM extends Producto {

    private VentaController venco = new VentaController();
    private String Vendedor;
    private double subtotal;
    private String CodigoVend;
    private String CodigoComp;
    private double sueldo;
    private String Direccion;
    private boolean DV;

    public VentaM(String ID, String nombre, double precio, int cantidad, String Vendedor, double subtotal, String CodigoVend, String CodigoComp, boolean DV) {
        super(ID, nombre, precio, cantidad);
        this.Vendedor = Vendedor;
        this.subtotal = subtotal;
        this.CodigoVend = CodigoVend;
        this.CodigoComp = CodigoComp;
        this.DV = DV;
    }

    public VentaM(String ID, String nombre,int cantidad, String Vendedor, double subtotal, String CodigoVend, String Direccion, double precio, boolean DV) {
        super(ID, nombre, precio, cantidad);
        this.Vendedor = Vendedor;
        this.subtotal = subtotal;
        this.CodigoVend = CodigoVend;
        this.Direccion = Direccion;
        this.DV = DV;
    }

    public VentaM(String ID, String nombre, double precio, int cantidad, String Vendedor, double subtotal, String CodigoVend, double sueldo) {
        super(ID, nombre, precio, cantidad);
        this.Vendedor = Vendedor;
        this.subtotal = subtotal;
        this.CodigoVend = CodigoVend;
        this.sueldo = sueldo;
    }

    public VentaM(String ID, String nombre, double precio, int cantidad, String Vendedor, double subtotal, String CodigoVend) {
        super(ID, nombre, precio, cantidad);
        this.Vendedor = Vendedor;
        this.subtotal = subtotal;
        this.CodigoVend = CodigoVend;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getCodigoVend() {
        return CodigoVend;
    }

    public void setCodigoVend(String CodigoVend) {
        this.CodigoVend = CodigoVend;
    }

    public String getCodigoComp() {
        return CodigoComp;
    }

    public void setCodigoComp(String CodigoComp) {
        this.CodigoComp = CodigoComp;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public VentaController getVenco() {
        return venco;
    }

    public void setVenco(VentaController venco) {
        this.venco = venco;
    }


    public boolean isDV() {
        return DV;
    }

    public void setDV(boolean DV) {
        this.DV = DV;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    
}
