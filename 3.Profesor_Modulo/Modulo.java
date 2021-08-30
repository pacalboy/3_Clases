public class Modulo {
    
    private NombreModulo nombre;
    private Profesor profesor;
    int aula;
    byte curso;
    private byte nHoras;
    private byte nMatriculados;
    final int MAX_ALUMNOS = 20;
    private boolean practica;
    
    public Modulo(){
    }

    public Modulo(NombreModulo nombre, Profesor profesor, byte curso, byte nHoras) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.curso = curso;
        this.nHoras = nHoras;
    }

    public Modulo(NombreModulo nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public Modulo(NombreModulo nombre) {
        this.nombre = nombre;
    }

    public Modulo(NombreModulo nombre, Profesor profesor, int aula, byte curso,
            byte nHoras, byte nMatriculados, boolean practica) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.aula = aula;
        this.curso = curso;
        this.nHoras = nHoras;
        this.nMatriculados = nMatriculados;
        this.practica = practica;
    }

    public NombreModulo getNombre() {
        return nombre;
    }

    public void setNombre(NombreModulo nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public byte getnHoras() {
        return nHoras;
    }

    public void setnHoras(byte nHoras) {
        this.nHoras = nHoras;
    }

    public byte getnMatriculados() {
        return nMatriculados;
    }

    public boolean setnMatriculados(byte nMatriculados) {
        if(nMatriculados>=0 && nMatriculados<=MAX_ALUMNOS){
            this.nMatriculados = nMatriculados;
            return true;
        }else
            return false;
    }

    public boolean isPractica() {
        return practica;
    }

    public void setPractica(boolean practica) {
        this.practica = practica;
    }
    
    public void desmatricularAlumno(){
        if(nMatriculados>0)
            nMatriculados--;
    }
    
    public void matricularAlumno(){
        if(nMatriculados<MAX_ALUMNOS)
            nMatriculados++;
    }

    @Override
    public String toString() {
        return "\nModulo: " + nombre  + "\nAula: " + aula 
                + "\nCurso: " + curso + "\nNº de horas: " + nHoras 
                + "\nAlumnos matriculados: " + nMatriculados + "\nMáximo de alumnos: " + MAX_ALUMNOS
                + "\nPráctica: " + practica + "\nProfesor: " + profesor;
    }
    
    
}
