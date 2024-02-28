
import java.util.Scanner;
import java.util.InputMismatchException;

public class Validaciones {

    public static int obtenerNumero(Scanner scanner) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingrese un número de 7 dígitos: ");
                numero = scanner.nextInt();
                if (numero < 0) {
                    System.out.println("Error: No se permiten números negativos.");
                } else if (String.valueOf(numero).length() != 7) {
                    System.out.println("Debe ingresar un número de 7 dígitos.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Solo se permiten números enteros.");
                scanner.next(); // Limpia el buffer del scanner
            }
        }

        return numero;
    }
}
