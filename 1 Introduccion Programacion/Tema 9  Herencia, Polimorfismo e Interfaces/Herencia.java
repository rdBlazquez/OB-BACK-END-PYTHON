public class Herencia {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.velocidadMaxima = 14;
        coche.matricula = "FG 1232456";
        System.out.println(coche.compruebaMatricula(coche.matricula));

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.velocidadMaxima = 20;
        cocheElectrico.matricula = "XXX";
        System.out.println(cocheElectrico.compruebaMatricula(cocheElectrico.matricula));
    }
}

class Vehiculo {
    int velocidadMaxima;
    String matricula;

    public boolean compruebaMatricula(String matricula){
        if (matricula == "XXX") {
            return true;
        }
        return false;
    }

}

final class Coche extends Vehiculo {}

class CocheElectrico extends Vehiculo {}
