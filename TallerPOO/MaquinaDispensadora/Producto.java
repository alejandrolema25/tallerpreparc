package TallerPOO.MaquinaDispensadora;

public class Producto {

    //Atributos.

    String nombre;
    byte codigo;
    byte cantidad;
    int precio;

    //Constructores.

    public Producto(String nombre,byte codigo, byte cantidad, int precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getCodigo() {
        return codigo;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
