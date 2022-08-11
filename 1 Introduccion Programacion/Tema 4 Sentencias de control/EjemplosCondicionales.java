
/**
 * EjemplosCondicionales
 */
public class EjemplosCondicionales {

    public static void main(String[] args) {
        String estacion = "primavera";
        int contador = 10;

        //if...else if...else

        if(estacion == "primavera") {
           System.out.println("Es primavera"); 
        } else if (estacion == "verano") {
            System.out.println("Es verano");
        } else {
            System.out.println("Es otra estación..."); //faultback o accion por defecto
        }

        //do...while primero la accion y despues la condicion
        do {
            System.out.println("en el do while " + contador);
            contador = contador - 1;
        } while(contador > 10);

        //while  primero se ejecuta la condicion y si se cumple la accion
        while(contador > 1) {
            System.out.println("en el while " + contador);
            contador -= 1;
        }

    }
}
