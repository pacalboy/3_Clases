//Atributos de Persona
public class Persona {
    private String nombre;
    private String dNI;

    //Constructor de Persona completo
    public Persona(String nombre, String dNI) {
        this.nombre = nombre;
        this.dNI = dNI;
    }

    //Método get para obtener el DNI
    public String getdNI() {
        return dNI;
    }

    //Método toString de Persona
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dNI=" + dNI + '}';
    }
}
