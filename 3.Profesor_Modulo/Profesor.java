public class Profesor {
    private String nombre;
    private String domicilio;
    private String titulacion;
    private int telefono;
    
    public Profesor(){
    }
    
    public Profesor(String nombre, String domicilio, String titulacion, int telefono){
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.titulacion = titulacion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + "\n\tDomicilio: " + domicilio + "\n\tTitulación: "
                + titulacion + "\n\tTeléfono: " + telefono;
    }
    
    
}
