public class HerenciaAbstractas {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("BRRR");
        System.out.println(coche.getSonido());
    }
}

abstract class Vehiculo {
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo() {
        System.out.println("Estoy en el constructor de Vehiculo");
    }

    abstract public void setSonido(String sonido);

    abstract public String getSonido();
}

//Las clases Coche y Moto al heredar de Vehiculo que es abstracta
//deben implementar sus metodos obligatoriamente de la forma que necesiten
class Coche extends Vehiculo {
    @Override
    public String getSonido() {
        return "Soy un supersonido de coche: " + this.sonido;
    }

    @Override
    public void setSonido(String sonido) {
        this.sonido = sonido;        
    }
}

class Moto extends Vehiculo {
    @Override
    public String getSonido() {
        return "Soy un sonidillo de moto: " + this.sonido;
    }

    @Override
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
