import java.util.ArrayList;

public class GestionaAgenda {

    public static void main(String[] args) {
        //Se crea una agenda de clase Agenda
        Agenda agenda = new Agenda();
        
        //Se crea una persona p1 y se muestra el DNI
        Persona p1 = new Persona ("Motrilo", "65478541D");
        System.out.println(p1.getdNI());
        
        //Se añade la persona a la agenda
        agenda.addPersona(p1);
        System.out.println(agenda.getListaPersonas());
        
        //Se crea persona p2 y se añade a la agenda
        Persona p2 = new Persona ("Juan", "77412254X");
        agenda.addPersona(p2);
        
        //Se borra la persona p1
        boolean exito = agenda.borraPersona(p1.getdNI());
        if (exito)
            System.out.println("Se ha borrado la persona");
        else
            System.out.println("No se encentra la persona");
        
        //Muestra la agenda
        System.out.println(agenda.getListaPersonas());
        
        //Añade la persona p2 
        agenda.addPersona(p2);
        
        //Muestra la agenda
        System.out.println(agenda.getListaPersonas());
        
        //Añade de nuevo la persona p1 y muestra la agenda
        agenda.addPersona(p1);
        System.out.println(agenda.getListaPersonas());
    }
    
}
