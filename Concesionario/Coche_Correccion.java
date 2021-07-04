public class Coche_Correccion {
    char [] matricula = new char[7];
    private String modelo;
    private int nSeguro;
    private String color = "Blanco";
    private byte nMarchas;
    final byte N_RUEDAS = 4;
    private float precio;
    private boolean vendido = false;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getnSeguro() {
        return nSeguro;
    }

    public void setnSeguro(int nSeguro) {
        this.nSeguro = nSeguro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getnMarchas() {
        return nMarchas;
    }

    public void setnMarchas(byte nMarchas) {
        if(nMarchas>0)
            this.nMarchas = nMarchas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void aumentarPrecio(float aumento){
        precio += aumento;
    }
    
    public void disminuirPrecio(float decremento){
        precio -= decremento;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    
    public String getMatricula(){
        String m = "";
        for(char c : matricula){
            m += c;
        }
        return m;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + getMatricula() + ", modelo=" + modelo + ", nSeguro=" + nSeguro + ", color=" + color + ", nMarchas=" + nMarchas + ", N_RUEDAS=" + N_RUEDAS + ", precio=" + precio + ", vendido=" + vendido + '}';
    }
    
}
