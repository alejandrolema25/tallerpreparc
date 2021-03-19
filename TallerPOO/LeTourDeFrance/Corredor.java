package TallerPOO.LeTourDeFrance;

public class Corredor {

    String nombre;
    byte   edad;
    String nacionalidad;
    byte camisa;

    public Corredor(String nombre, byte edad, byte camisa, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;

    }

    public byte getCamisa() {
        return camisa;
    }

    public void setCamisa(byte camisa) {
        this.camisa = camisa;
    }

    public String getNombre() {
        return this.nombre;
    }

    public short getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

}
