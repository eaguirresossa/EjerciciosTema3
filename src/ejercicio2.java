public class ejercicio2 {
    public static void main (String args[]){
        coche miCoche = new coche();
        miCoche.AdicionarPuerta();
        System.out.println("El total de las puertas es: "+miCoche.puertas);
    }
}

class coche {
    public int puertas = 4;

    public void AdicionarPuerta(){
        this.puertas++;
    }
}