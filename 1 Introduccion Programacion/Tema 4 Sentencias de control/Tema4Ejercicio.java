public class Tema4Ejercicio {
    public static void main(String[] args) {
        int numeroif = 3;
        int numeroWhile = 1;
        int numeroDoWhile = -1;
        String estacion = "verano";
        

        //Ejercicio if...else if...else
        if(numeroif > 0) {
            System.out.println("El numero es positivo");
        } else if(numeroif < 0) {
            System.out.println("El numero es negato");
        } else {
            System.out.println("El numero es 0");
        }

        //Ejercicio while
        while(numeroWhile <= 2){
            
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //Ejercicio do...while
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);

        //Ejercicio for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //Ejercicio switch
        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No es una estacion del año");
                break;

        }


    }
}
