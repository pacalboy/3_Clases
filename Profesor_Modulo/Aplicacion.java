import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Se crea un profesor con el constructor completo
        Profesor profe1 = new Profesor ("Luisa", "avda San Pancracio 33", "Matemáticas de la computación", 123456);
        
        //Se crea un profesor por defecto y se rellena con métodos set
        Profesor profe2 = new Profesor();
        profe2.setNombre("Manuel");
        profe2.setDomicilio("calle Falsa 123");
        profe2.setTitulacion("Ingeniería informática");
        profe2.setTelefono(555426);
        
        //Se crea un módulo con el constructor modulo-profesor
        Modulo mod1 = new Modulo(NombreModulo.PROGRAMACION,profe1);
        
        //Se crea un constructor por defecto y se le añade nombre y profesor
        Modulo mod2 = new Modulo();
        mod2.setNombre(NombreModulo.ANDROID);
        mod2.setProfesor(profe2);
        
        //Se solicita el numero de alumnos matriculados en ambos módulos
        System.out.println("Introduzca número de alumnos matriculados en el módulo de Programación");
        byte numIntro = scan.nextByte();
        while (!mod1.setnMatriculados(numIntro)){
            System.out.println("Número incorrecto, solo se admitirán entre 0 y 20 alumnos");
            numIntro = scan.nextByte();
        }
        
        System.out.println("Introduzca número de alumnos matriculados en el módulo de Android");
        numIntro = scan.nextByte();
        while (!mod2.setnMatriculados(numIntro)){
            System.out.println("Número incorrecto, solo se admitirán entre 0 y 20 alumnos");
            numIntro = scan.nextByte();
        }
        
        //Se rellenan los atributos que faltan
        mod1.aula = 7;
        mod1.curso = 1;
        mod1.setnHoras((byte)96);
        mod1.setPractica(false);
        
        mod2.aula = 9;
        mod2.curso = 2;
        mod2.setnHoras((byte)64);
        mod2.setPractica(true);
        
        //Se muestran las propiedades con toString
        System.out.println(mod1.toString());
        System.out.println(mod2.toString());
        
        //Desmatriculamos 1 alumno en el primer módulo y matriculamos a 1 en el segundo
        mod1.desmatricularAlumno();
        mod2.matricularAlumno();
        
        //Volvemos a mostrar las propiedades
        System.out.println(mod1.toString());
        System.out.println(mod2.toString());
        
        
        
    }
}
