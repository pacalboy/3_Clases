public class Electrodomestico {

    private int potencia;
    private static double consumoTotal;
    
    //Constructor introduciendo la potencia
    public Electrodomestico(int potencia){
        if (potencia > 0)
            this.potencia = potencia;
        else
            this.potencia = 0;
    }
    
    //Método para incrementar el consumo total en función de las horas conectadas
    public void consumo(double horas){
        if (horas > 0) 
            consumoTotal += horas*potencia;
        else
            consumoTotal += 0;
    }

    //Método get para obtener el consumo total
    public static double getConsumoTotal() {
        return consumoTotal;
    }

    //Método para imprimir el consumo total
    public static String mostrar(){
        return "El consumo total es de " + consumoTotal + " KW";
    }
    
}
