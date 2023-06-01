public class Excepciones2 {
    public static void main(String[] args) {

    int edades [] = {20, 30, 40, 50};

    try {
    System.out.println("la edad de la posicion 4 es: " + edades[4]);
    }
    catch (Exception e) {
    System.out.println("Se  intento acceder a un indice que no existe");

    }
}
}
