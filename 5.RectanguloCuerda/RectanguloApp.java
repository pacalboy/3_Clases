import java.util.Scanner;

public class RectanguloApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduzca la base del rectángulo en metros");
        double base1 = scan.nextDouble();
        //La base debe ser mayor que 0
        while (base1 <= 0) {
            System.out.println("La base no puede ser 0 o negativa\n"
                    + "Introduzca una base en metros");
            base1 = scan.nextDouble();
        }
        
        System.out.println("Introduzca la altura del rectángulo en metros");
        double altura1 = scan.nextDouble();
        //La altura debe ser mayor que 0
        while (altura1 <= 0) {
            System.out.println("La altura no puede ser 0 o negativa\n"
                    + "Introduzca una altura en metros");
            altura1 = scan.nextDouble();
        }
        
        Rectangulo r1 = new Rectangulo(base1, altura1);
        //Mostramos el área y el perímetro del rectángulo
        System.out.println("El area del rectángulo es " + r1.area() + " m²\n"
                + "El perímetro del rectángulo es " + r1.perimetro() + " metros");
        //Mostramos la cuerda usada en este rectángulo
        System.out.println(r1.cuerdaRectangulo());
        
        System.out.println("\nIntroduzca la base del rectángulo en metros");
        double base2 = scan.nextDouble();
        //La base debe ser mayor que 0
        while (base2 <= 0){
            System.out.println("La base no puede ser 0 o negativa/n"
                    + "Introduzca una altura en metros");
            base2 = scan.nextDouble();
        }    
        System.out.println("Introduzca la altura del rectángulo en metros");
        double altura2 = scan.nextDouble();
        //La altura debe ser mayor que 0
        while (altura2 <= 0) {
            System.out.println("La altura no puede ser 0 o negativa/n"
                    + "Introduzca una altura en metros");
            altura2 = scan.nextDouble();
        }
        
        Rectangulo r2 = new Rectangulo(base2, altura2);
        //Mostramos el área y el perímetro del rectángulo
        System.out.println("El area del rectángulo es " + r2.area() + " m²\n"
                + "El perímetro del rectángulo es " + r2.perimetro() + " metros");
        //Mostramos la cuerda usada en este rectángulo
        System.out.println(r2.cuerdaRectangulo());
        
        //Mostramos el total de cuerda usada
        System.out.println(Rectangulo.cuerdaUsada());
                
    }
    
}
