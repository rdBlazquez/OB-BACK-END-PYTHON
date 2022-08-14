
public class Poo {
    
    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println("Puertas: "+ coche.numeroDePuertas);
        System.out.println("Velocidad Maxima: "+ coche.velocidadMaxima);
        System.out.println("Velocidad Actual: " + coche.velocidadActual);

        Coche coche2 = new Coche(2, 90);
        System.out.println("Puertas: "+ coche2.numeroDePuertas);
        System.out.println("Velocidad Maxima: "+ coche2.velocidadMaxima);
        System.out.println("Velocidad Actual: " + coche2.velocidadActual);
        
    }
}

class Coche {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche() {
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor SIN parametros");
    }

    public Coche(int numeroDePuertas, int velocidadMaxima) {
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Estoy en el constructor CON parametros");
    }

    public void acelerar() {
        velocidadActual += 15;
    }
    public void decelerar() {}
}
