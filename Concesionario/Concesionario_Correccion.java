import java.util.Scanner;

public class Concesionario_Correccion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Coche c1 = new Coche();
        Coche c2 = new Coche();
        Coche c3 = new Coche();
        Coche c4 = new Coche();
        Coche c5 = new Coche();

        System.out.println("Introduce el modelo de los nuevos coches");
        String nuevoModelo = sc.nextLine();

        c1.setModelo(nuevoModelo);
        c2.setModelo(nuevoModelo);
        c3.setModelo(nuevoModelo);
        c4.setModelo(nuevoModelo);
        c5.setModelo(nuevoModelo);

        System.out.println("Introduce el nº de marchas de los nuevos coches");

        byte marchas = sc.nextByte();
        while (marchas < 3 || marchas > 7) {
            marchas = sc.nextByte();
        }

        c1.setnMarchas(marchas);
        c2.setnMarchas(marchas);
        c3.setnMarchas(marchas);
        c4.setnMarchas(marchas);
        c5.setnMarchas(marchas);

        c3.setColor("Azul");
        c5.setColor("Verde");

        float precio = 6000.0f;
        c1.setPrecio(precio);
        c2.setPrecio(precio);
        c3.setPrecio(precio);
        c4.setPrecio(precio);
        c5.setPrecio(precio);

        System.out.println("Ruedas coche 2: " + c2.N_RUEDAS);

        float sobreCoste = 1000.0f;
        c3.aumentarPrecio(sobreCoste);
        c5.aumentarPrecio(sobreCoste);

        System.out.println("Precio de los coches: "
                + "\n\tCoche 1: " + c1.getPrecio()
                + "\n\tCoche 2: " + c2.getPrecio()
                + "\n\tCoche 3: " + c3.getPrecio()
                + "\n\tCoche 4: " + c4.getPrecio()
                + "\n\tCoche 5: " + c5.getPrecio());

        float rebaja = 2000.0f;
        c1.disminuirPrecio(rebaja);
        c2.disminuirPrecio(rebaja);
        c3.disminuirPrecio(rebaja);
        c4.disminuirPrecio(rebaja);
        c5.disminuirPrecio(rebaja);

        System.out.println("Precio de los coches: "
                + "\n\tCoche 1: " + c1.getPrecio()
                + "\n\tCoche 2: " + c2.getPrecio()
                + "\n\tCoche 3: " + c3.getPrecio()
                + "\n\tCoche 4: " + c4.getPrecio()
                + "\n\tCoche 5: " + c5.getPrecio());

        System.out.println("LLEGA EL CLIENTE: ");
        System.out.println("¿Qué coche quieres? Introduce 1-5");
        int eleccion = sc.nextInt();
        while(eleccion<1 || eleccion>5){
            System.out.println("Lo sentimos no tenemos ese coche. Pruebe otra vez");
            eleccion = sc.nextInt();
        }
        
        System.out.println("Introduce una matrícula: ");
        String matricula = sc.next();
        while(matricula.length() != 7){
            matricula = sc.next();
        }
        System.out.println("Introduce un número de seguro: ");
        int nSeguro = sc.nextInt();
        while(nSeguro < 0 ){
            nSeguro = sc.nextInt();
        }
        switch (eleccion) {
            case 1:
                c1.matricula = matricula.substring(0, 7).toCharArray();
                c1.setnSeguro(nSeguro);
                c1.setVendido(true);
                System.out.println(c1.toString());
                break;
            case 2:
                c2.matricula = matricula.substring(0, 7).toCharArray();
                c2.setnSeguro(nSeguro);
                c2.setVendido(true);
                System.out.println(c2.toString());
                break;
            case 3:
                c3.matricula = matricula.substring(0, 7).toCharArray();
                c3.setnSeguro(nSeguro);
                c3.setVendido(true);
                System.out.println(c3.toString());
                break;
            case 4:
                c4.matricula = matricula.substring(0, 7).toCharArray();
                c4.setnSeguro(nSeguro);
                c4.setVendido(true);
                System.out.println(c4.toString());
                break;
            case 5:
                c5.matricula = matricula.substring(0, 7).toCharArray();
                c5.setnSeguro(nSeguro);
                c5.setVendido(true);
                System.out.println(c5.toString());
                break;
        }
    }
}
