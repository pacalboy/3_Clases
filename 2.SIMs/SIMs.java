import java.util.Random;
import java.util.Scanner;

public class SIMs {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        //Probamos los diferentes constructores
        Personaje p0 = new Personaje();
        Personaje p1 = new Personaje("Paco");
        Personaje p2 = new Personaje("Pedro",'j' );
        Personaje p3 = new Personaje("Andrea", 'M', 950.0f );
        Personaje p4 = new Personaje("Luisa", 'M', 1560.0f, 125, 80);
        
        //Imprimimos los objetos para comprobar los constructores
        System.out.println(p0.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        
        //La aplicación que demuestra la creación y gestión de un SIM
        System.out.println("\nIntroduzca nombre para jugar con un personaje genérico");
        String nombre = scan.next();
        Personaje player = new Personaje (nombre);
        
        float costeComida, costeRopa;
        int nHoras;
        int seleccion1, seleccion2;
        boolean noSalir = true;
        
        while (player.isVivo() && noSalir){
            System.out.println(player.toString());
            
            System.out.println("\n¿Qué quieres hacer?\n"
                    + "\t1. Dormir\n"
                    + "\t2. Echar siesta\n"
                    + "\t3. Pedir comida a domicilio\n"
                    + "\t4. Hacer deporte\n"
                    + "\t5. Comprar ropa\n"
                    + "\t6. Trabajar\n"
                    + "\t7. Cambiar algún atributo\n"
                    + "\t8. Salir");
            seleccion1 = scan.nextInt();
            
            switch (seleccion1) {
                case 1:
                    player.dormir();
                    break;
                case 2:
                    player.siesta();
                    break;
                case 3:
                    costeComida = (random.nextInt(401)+100);
                    System.out.println("Supone un coste de "+costeComida);
                    player.pedirComidaDomicilio(costeComida);
                    if(!player.gastarDinero(costeComida))
                        System.out.println("Dinero insuficiente, no has comido");
                    break;
                case 4:
                    player.hacerDeporte();
                    break;
                case 5:
                    costeRopa = random.nextInt(600)+100;
                    System.out.println("Supone un coste de "+costeRopa);
                    player.comprarRopa(costeRopa);
                    if(!player.gastarDinero(costeRopa))
                        System.out.println("Dinero insuficiente, no has comprado ropa");
                    break;
                case 6:
                    System.out.println("¿Cuántas horas trabajas?");
                    nHoras = scan.nextInt();
                    player.trabajar(nHoras);
                    break;
                case 7:
                    System.out.println("Qué deseas cambiar?\n"
                            + "\t1. Género\n"
                            + "\t2. Nombre\n"
                            + "\t3. Salir");
                    seleccion2 = scan.nextInt();
                    if (seleccion2 == 2 && player.numCambioNombre>0){
                        System.out.println("Solo se permite 1 cambio de nombre, lo sentimos");
                        break;
                    }    
                    if(seleccion2 == 1){
                        System.out.println("Introduzca H o M");
                        player.setGenero(scan.next().charAt(0));
                    }else if (seleccion2 == 2){
                        System.out.println("Solo se permite 1 cambio de nombre.\n"
                                + "Introduzca nombre definitivo");
                            player.setNombre(scan.next());
                    }
                    break;                    
                default:
                    noSalir = false;
                    break;
            }
        }
        if(!player.isVivo())
            System.out.println("Has muerto");
        
        System.out.println("Tus estadísticas finales:\n"
                + player.toString());
    }
    
}
