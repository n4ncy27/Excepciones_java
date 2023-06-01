// Ingrese un numero 
import java.util.Scanner;

public class Ejexcepcion {
    public static void main(String[] args) { 
        //Scanner para leer los datos de entrada
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingrese un número: ");
        
        // Leer el número ingresado
        int numero = scanner.nextInt();
        
        // Imprimir el número ingresado
        System.out.println("El número ingresado es: " + numero);
        
        // Cerrar el scanner
        scanner.close();
    }
}

