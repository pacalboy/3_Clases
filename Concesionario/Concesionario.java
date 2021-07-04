public class Concesionario {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Se crean los 5 objetos coche
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        Coche coche4 = new Coche();
        Coche coche5 = new Coche();
        
        //El usuario introduce el nombre del modelo y se asignan a todos los objetos
        System.out.println("Introduzca modelo de coche");
        String modelo = scan.next();
        //Se pone el nombre del modelo en CamelCase
        modelo = modelo.substring(0,1).toUpperCase().concat(modelo.substring(1).toLowerCase());
        
        coche1.setModelo(modelo);
        coche2.setModelo(modelo);
        coche3.setModelo(modelo);
        coche4.setModelo(modelo);
        coche5.setModelo(modelo);
        
        //El usuario introduce el número de marchas y se asignan a todos los objetos
        System.out.println("Introduzca número de marchas");
        byte marchas = scan.nextByte();
        
        coche1.setnMarchas(marchas);
        coche2.setnMarchas(marchas);
        coche3.setnMarchas(marchas);
        coche4.setnMarchas(marchas);
        coche5.setnMarchas(marchas);
        
        //Se modifica el color de los coches 3 y 5
        coche3.setColor("Negro");
        coche5.setColor("Azul");
        
        //Se establece un precio y se asigna a todos los objetos
        int precio = 6000;
        coche1.setPrecio(precio);
        coche2.setPrecio(precio);
        coche3.setPrecio(precio);
        coche4.setPrecio(precio);
        coche5.setPrecio(precio);
        
        //Se consulta el numero de ruedas de coche2
        System.out.println("Número de ruedas del coche 2: " +coche2.N_RUEDAS);
        
        //Se establece un aumento de precio y se le asigna a los coches 3 y 5
        //Se imprimen los precios
        int aumento = 1000;
        coche3.aumentarPrecio(aumento);
        coche5.aumentarPrecio(aumento);
        
        System.out.println("Precio coche 1: " +coche1.getPrecio());
        System.out.println("Precio coche 2: " +coche2.getPrecio());
        System.out.println("Precio coche 3: " +coche3.getPrecio());
        System.out.println("Precio coche 4: " +coche4.getPrecio());
        System.out.println("Precio coche 5: " +coche5.getPrecio());
        
        //Se establece un decremento de precio para todos los coches
        //Se imprimen los precios actualizados
        int decremento = 2000;
        coche1.disminuirPrecio(decremento);
        coche2.disminuirPrecio(decremento);
        coche3.disminuirPrecio(decremento);
        coche4.disminuirPrecio(decremento);
        coche5.disminuirPrecio(decremento);
        
        System.out.println("\nPrecio coche 1: " +coche1.getPrecio());
        System.out.println("Precio coche 2: " +coche2.getPrecio());
        System.out.println("Precio coche 3: " +coche3.getPrecio());
        System.out.println("Precio coche 4: " +coche4.getPrecio());
        System.out.println("Precio coche 5: " +coche5.getPrecio());
        
        //Se solicita un numero de coche al usuario
        System.out.println("\n¿Qué coche desea? Introduzca el número de modelo");
        int numIntro = scan.nextInt();
        //En caso de que no sea correcto se le vuelve a pedir
        boolean correcto = numIntro>0 && numIntro<6;
        while (!correcto) {
            System.out.println("Número incorrecto, vuelva a introducir el número");
            numIntro = scan.nextInt();
            correcto = numIntro>0 && numIntro<6;
        }
        
        //Se crea un objeto nuevo
        Coche cocheCliente = new Coche();
        
        //Se copian los atributos del coche seleccionado y se marca como vendido
        switch (numIntro) {
            case 1:
                cocheCliente = coche1;
                coche1.setVendido(true);
                break;
            case 2:
                cocheCliente = coche2;
                coche2.setVendido(true);
                break;
            case 3:
                cocheCliente = coche3;
                coche3.setVendido(true);
                break;
            case 4:
                cocheCliente = coche4;
                coche4.setVendido(true);
                break;
            case 5:
                cocheCliente = coche5;
                coche5.setVendido(true);
                break;
        }
        //Se introduce la matrícula y el seguro
        System.out.println("Introduzca matrícula carácter a carácter");
        
        for (int i = 0; i<cocheCliente.matricula.length; i++) {
            cocheCliente.matricula[i] = scan.next().toUpperCase().charAt(0);
        }
        System.out.println("Introduzca número de seguro");
        cocheCliente.setnSeguro(scan.nextInt());
        
        //Se imprimen los datos del coche
        System.out.print("\nLos atributos del coche seleccionado son: \n\tMatrícula: ");
        
        for (char c : cocheCliente.matricula) {
            System.out.print(c);         
        }
        System.out.println("\n\tModelo: " +cocheCliente.getModelo());
        System.out.println("\tSeguro: " +cocheCliente.getnSeguro());
        System.out.println("\tColor: " +cocheCliente.getColor());
        System.out.println("\tMarchas: " +cocheCliente.getnMarchas());
        System.out.println("\tRuedas: " +cocheCliente.N_RUEDAS);
        System.out.println("\tPrecio: " +cocheCliente.getPrecio());
    }
}
