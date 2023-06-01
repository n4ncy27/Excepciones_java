// ejemplo 1 division entre 0
public class Excepciones {

    public static void main(String[] args) {

        // Tratamiento de la excepción aritmética
        try {    
            int resultado = 3/0;
            System.out.println("resultado = " + resultado);
        } 
        
        catch (ArithmeticException e) {
            System.out.println("Error: División entre cero.");
        }
    }
}
