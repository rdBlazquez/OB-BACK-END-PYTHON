public class Errores {
    public static void main(String[] args) {
        
        int numeros[][] = {
            {10, 20, 30, 40, 50},
            {60, 70, 80, 90}
        };

        //for para recorrer array bidimensional numeros
        //por cada subarray se muestra el valor en ese momento
        //En este caso si se puede llamar a las variables i, j, k...
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]);
            }
        }

        //forma mas simple de recorrer arrays con un for each
        int numero[] = {1, 2, 3, 4, 5};
        
        for (int i : numero) {
            System.out.println(i);
        }

        var temperatura1 = 15;
        //Comentario innecesario "compruebo que la temperatura sea 15"
        if (temperatura1 == 15) {
            System.out.println("Es 15");
        }


        //Error programacion convertir tipos grandes a pequeños
        //perdiendo precision
        double temperatura = 35.9;
        int temperaturaInt = (int)temperatura;
        imprimeTemperatura(temperaturaInt);

        //Error programacion Out of bounds - off by one
        //Aunque declare el array de 5 elementos el ultimo indice es el 4

        int array[] = new int[5];
        System.out.println(array[4]);

        //Error Overflow cuando sobrepasamos el valor de un tipo
        byte number = 127;
        System.out.println(number);

        number += 5;
        System.out.println(number);  //imprime -124 da la vuelta

    }

    public static void imprimeTemperatura(int valor){
        System.out.println(valor);
    }
}
