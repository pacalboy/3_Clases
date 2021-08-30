public class Personaje {
    private String nombre;
    private char genero;
    private float dinero = 10000.0f;
    private int nivelComida = 50;
    private int nivelEnergia = 50;
    private boolean vivo = true;
    
    boolean genCorrecto;
    byte numCambioNombre = (byte)0;
    private final int MAX_ENERGIA = 100;
    private final int MAX_COMIDA = 100;
    private final int MINIMO = 1;
    
    public Personaje() {
    }

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public Personaje(String nombre, char genero){
        this.nombre = nombre;
        genero = Character.toUpperCase(genero);
        genCorrecto = genero == 'H' || genero == 'M';
        if(genCorrecto)
            this.genero = genero;
    }

    public Personaje(String nombre, char genero, float dinero){
        this.nombre = nombre;
        genero = Character.toUpperCase(genero);
        genCorrecto = genero == 'H' || genero == 'M';
        if(genCorrecto)
            this.genero = genero;
        if (dinero >= 0)
            this.dinero = dinero;
    }
    
    public Personaje(String nombre, char genero, float dinero, int nivelComida, int nivelEnergia){
        this.nombre = nombre;
        genero = Character.toUpperCase(genero);
        genCorrecto = genero == 'H' || genero == 'M';
        if(genCorrecto)
            this.genero = genero;
        if (dinero >= 0)
            this.dinero = dinero;
        if (nivelComida>=MINIMO && nivelComida<=MAX_COMIDA)
            this.nivelComida = nivelComida;
        if (nivelEnergia>=MINIMO && nivelEnergia<=MAX_ENERGIA)
            this.nivelEnergia = nivelEnergia;
    }

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        if(numCambioNombre<1){
            this.nombre = nombre;
            numCambioNombre ++;
        }    
    }

    public char getGenero(){
        return genero;
    }

    public void setGenero(char genero){
        genero = Character.toUpperCase(genero);
        genCorrecto = genero == 'H' || genero == 'M';
        if(genCorrecto)
            this.genero = genero;
    }

    public float getDinero(){
        return dinero;
    }

    public int getNivelComida(){
        return nivelComida;
    }

    public int getNivelEnergia(){
        return nivelEnergia;
    }

    public boolean isVivo(){
        return vivo;
    }
    
    public void ganarDinero(float cantidad){
        if (cantidad >0)
            dinero += cantidad;
    }
    
    public boolean gastarDinero (float cantidad){
        if (cantidad>0 && dinero>=cantidad){
            dinero -= cantidad;
            return true;
        }else
            return false;
    }
    
    public void dormir(){
        incrementarEnergia(50);
        decrementarComida(10);
    }
    
    public void siesta(){
        incrementarEnergia(10);
    }
    
    public void incrementarComida(int aumento){
        nivelComida += aumento;
        if (nivelComida > MAX_COMIDA)
            nivelComida = MAX_COMIDA;
    }
    
    public void decrementarComida (int perdida){
        nivelComida -= perdida;
        if (nivelComida < MINIMO)
            vivo = false;
    }
    
    public void incrementarEnergia(int aumento){
        nivelEnergia += aumento;
        if (nivelEnergia > MAX_ENERGIA)
            nivelEnergia = MAX_ENERGIA;
    }
    
    public void decrementarEnergia (int perdida){
        nivelEnergia -= perdida;
        if (nivelEnergia < MINIMO)
            vivo = false;
    }
    
    public void comer(){
        incrementarComida(20);
    }
    
    public void pedirComidaDomicilio(float coste){
        if (gastarDinero(coste)){
            comer();
        }    
    }
    
    public void hacerDeporte(){
        decrementarEnergia(30);
        decrementarComida(10);
    }
    
    public void comprarRopa(float coste){
        if (this.dinero > coste)
            gastarDinero(coste);
    }
    
    public void trabajar(int nHoras){
        ganarDinero(nHoras*120.0f);
    }
    
    @Override
    public String toString(){
        return "\n" + nombre + "\nGénero: " + genero + 
                "\nDinero: " + dinero + "\nComida: " + nivelComida + 
                "\nEnergía: " + nivelEnergia;
    }
}
