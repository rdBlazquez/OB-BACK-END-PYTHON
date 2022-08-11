public class App {
    public static void main(String[] args) throws Exception {

        suma(1, 2, 3);
        
        Coche miCoche = new Coche();
        miCoche.IncrementPuertas();
        System.out.println("El numero de puertas de miCoches es "+ miCoche.puertas);

    }

    public static void suma(int a, int b, int c) {
       System.out.println(a + b + c); 
    }

}

class Coche {
    public int puertas = 0;

    public void IncrementPuertas() {
        this.puertas++;
    }
}
