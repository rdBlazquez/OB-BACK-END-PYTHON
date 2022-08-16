public class Privacidad {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();

        //Una vez que declaro la variable tipo privada no las siguientes lineas dan error
        //vehiculo.tipo = "Coche";
        //System.out.println(vehiculo.tipo);


        //Para estipular e imprimir el tipo del vehiculo recurrimos 
        //al getter y al setter de la clase
        coche.setTipo("Coupe");
        System.out.println(coche.getTipo()); 
        coche.setVelocidadMaxima(120);
        System.out.println(coche.getVelocidadMaxima());
        coche.setrapido(true);
        System.out.println(coche.israpido());

        //Creo otro objeto vehiculo
        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scotter");
        System.out.println(moto.getTipo());
        moto.setVelocidadMaxima(50);
        System.out.println(moto.getVelocidadMaxima());
        moto.setrapido(false);
        System.out.println(moto.israpido());

    }
}

class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;

    //Encapsulamiento de variables privadas con getter y setter
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setrapido(boolean rapido) {
        this.rapido = rapido;
    }

    public boolean israpido() {
        return rapido
;
    }
}
