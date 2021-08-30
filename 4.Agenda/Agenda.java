import java.util.ArrayList;

public class Agenda {
    //Atributo privado de tipo ArrayList
    //almacenará una lista de objetos tipo Persona
    private ArrayList<Persona> lista;
    //Constructor de agenda
    //Llama al constructor de ArrayList
    public Agenda() {
        lista = new ArrayList<Persona>();
    }
    
    //Método que devuelve un String con todos los atributos de las personas
    //que contiene la lista
    public String getListaPersonas(){
        String resultado = "";
        for(Persona p : lista){
            resultado += p.toString();
        }
        return resultado;
    }
    //Método que recibe un DNI como parámetro
    //Comprueba si el DNI corresponde con el DNI de alguna persona de la lista
    //En caso afirmativo devuelve la persona, en caso contrario devuelve null
    public Persona buscaPersona(String otroDNI){
        for( Persona p : lista){
            if( p.getdNI().equals(otroDNI) )
                return p;
        }
        return null;
    }
    
    //Método que recibe un DNI como parámetro
    //Si el DNI se corresponde con el de alguna persona de la lista
    //borra a esa persona y devuelve true.
    //En caso de no encontrar la persona devuelve false
    public boolean borraPersona(String otroDNI){
        for( Persona p : lista){
            if( p.getdNI().equals(otroDNI) ){
                lista.remove(p);
                return true;
            }
        }
        return false;
    }
    
    //Método que recibe una persona como parámetro
    //Primero comprueba si el DNI de esa persona está en la lista.
    //Si está, considera que la persona está en la lista y no la añade.
    //En caso contrario, añade la persona a la lista
    //El método devuelve el número de personas de la lista
    public int addPersona(Persona p){
        if(buscaPersona( p.getdNI() ) != null){
            System.out.println("La persona con el DNI " + p.getdNI() + " ya está en la lista");
        } else {
            lista.add(p);
        }
        return lista.size();
    }
}
