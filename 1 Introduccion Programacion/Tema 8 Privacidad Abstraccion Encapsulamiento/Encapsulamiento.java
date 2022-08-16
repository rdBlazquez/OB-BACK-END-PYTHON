public class Encapsulamiento {
    
    public static void main(String[] args) {
        

    }
}

abstract class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private String sonido;

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

    //Tenemos que implementar tanto getSonido como setSonido
    abstract void setSonido(String sonido);

    abstract String getSonido();

}