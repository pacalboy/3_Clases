public class RectanguloCuerda {
    public double base;
    public double altura;
    public static double totalCuerda = 0;
    
    //Constructor de rectángulo introduciendo base y altura
    public Rectangulo(double base, double altura){
        //En caso de que el valor no sea mayor que 0 se introduce 0
        if (base > 0)
            this.base = base;
        else
            this.base = 0;
        //En caso de que el valor no sea mayor que 0 se introduce 0
        if (altura > 0)
            this.altura = altura;
        else 
            this.altura = 0;
        //Se añade el perímetro al total de cuerda
        totalCuerda += perimetro();
    }
    
    //Método con el que se calcula el área
    public double area(){
        double a = base*altura;
        return a;
    }
    
    //Método con el que se calcula el perímetro
    public double perimetro(){
        double p = (base+altura)*2;
        return p;
    }
    
    //Método que nos devuelve el valor de la cuerda usada en un rectángulo
    public String cuerdaRectangulo(){
        return "La cuerda usada en este rectángulo es " + perimetro() + " metros";
    }
    
    //Método que nos devuelve el valor del total de cuerda usada
    public static String cuerdaUsada(){
        return "\nEl total de cuerda usada es " + totalCuerda + " metros";
    }
    
}
