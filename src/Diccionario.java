import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("tiburón", "shark");
        diccionario.put("universidad", "college");
        diccionario.put("perro", "dog");
        diccionario.put("libro", "book");
        diccionario.put("gato", "cat");
        diccionario.put("cuaderno", "notebook");
        diccionario.put("hermana", "sister");
        diccionario.put("abeja", "bee");
        diccionario.put("oscuro", "dark");
        diccionario.put("sol", "sun");
        diccionario.put("dulce", "sweet");
        diccionario.put("gallina", "hen");
        diccionario.put("comida", "food");
        diccionario.put("mesa", "table");
        diccionario.put("loro", "parrot");
        diccionario.put("tienda", "store");
        diccionario.put("lámpara", "lamp");
        diccionario.put("playa", "beach");
        diccionario.put("bosque", "forest");

        //crear un objeto de la clase
        Random numerosAleatorios = new Random();
        Object[] palabras = diccionario.keySet().toArray();
        //llevar el conteo de cuántas respuestas correctas e incorrectas ha dado el usuario - Se inicializan en 0 al principio del programa
        int totalPalabras = 5;
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a tu diccionario español e ingles!");
        System.out.println("Por favor, traduce las siguientes palabras en español al inglés:");

        //bucle se encarga de iterar sobre un conjunto de palabras para que el usuario las traduzca. Comienza en 0 y se ejecuta mientras i sea menor que totalPalabras
        for (int i = 0; i < totalPalabras; i++) {
            // En cada iteración, se selecciona una palabra al azar del array palabras utilizando el método nextInt() del objeto numerosAleatorios. Luego, se almacena esa palabra en la variable palabra
            String palabra = (String) palabras[numerosAleatorios.nextInt(palabras.length)];
            System.out.print("Traduce '" + palabra + "': ");
            String respuesta = scanner.nextLine().toLowerCase();

            //Compara la respuesta del usuario con la traducción correcta de la palabra en el diccionario.
            //es correcta, se muestra "¡Perfecto!"+ incrementa el contador
            if (respuesta.equals(diccionario.get(palabra))) {
                System.out.println("¡Perfecto!");
                respuestasCorrectas++;
            }
            //"Incorrecto. La respuesta correcta es: " + se incrementa el contador de respuestas incorrectas.
            else {
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabra));
                respuestasIncorrectas++;
            }
        }

        System.out.println("¡El juego ha terminado, gracias por participar!");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        scanner.close();
    }
}