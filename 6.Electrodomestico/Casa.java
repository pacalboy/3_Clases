import java.util.Scanner;

public class Casa {
    
    //Método que devuelve el menú en un string
    public static String menu(){
        return "\n¿Qué electrodoméstico quieres encender?\n"
                + "\t1. Encender frigorífico\n"
                + "\t2. Encender horno\n"
                + "\t3. Encender microondas\n"
                + "\t4. Encender lavadora\n"
                + "\t5. Mostrar consumo total\n"
                + "\t6. Salir";
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //Se crean 4 electrodomésticos
        Electrodomestico frigorifico = new Electrodomestico (50);
        Electrodomestico horno = new Electrodomestico (120);
        Electrodomestico microondas = new Electrodomestico (45);
        Electrodomestico lavadora = new Electrodomestico (60);
        
        //Se imprime el menú de opciones, se guarda la opcion seleccionada 
        System.out.println(menu());
        int opcion = scan.nextInt();
        
        //Se inicializa la variable horas
        double horas = 0;
        
        //Bucle que funciona hasta que el usuario introduce la opción salir
        while (opcion != 6) {
            //Si la opción del menú es correcta se pregunta por las horas
            if (opcion >0 && opcion < 5){
                System.out.println("¿Cuántas horas lo tiene conectado?");        
                horas = scan.nextDouble();
            }else
                horas = 0;
            
            //En caso de introducir horas negativas se avisa que no se calculan
            if (horas < 0) {
                System.out.println("Horas incorrectas, no se han calculado");
            }
            
            //Se aplica el método segun la opción
            switch (opcion) {
                case 1:
                    frigorifico.consumo(horas);
                    break;
                case 2:
                    horno.consumo(horas);
                    break;
                case 3:
                    microondas.consumo(horas);
                    break;
                case 4:
                    lavadora.consumo(horas);
                    break;
                case 5:
                    System.out.println(Electrodomestico.mostrar());
                    System.out.println("El costo asciende a "
                            + Electrodomestico.getConsumoTotal()*0.15+ " €");
                    break;
                default:
                    System.out.println("Opción incorrecta, intente de nuevo");
                }
            
            //Se imprime el menú de opciones, se guarda la opcion seleccionada 
            System.out.println(menu());
            opcion = scan.nextInt();     
            
        }
        
    }
    
}
