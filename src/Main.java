import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroIngresado = Validaciones.obtenerNumero(scanner);

        int[] digitos = obtenerDigitos(numeroIngresado);

        Abaco abaco = new Abaco();
        abaco.establecerValores(digitos);

        abaco.mostrar();

        int sumaTotal = abaco.sumaTotal();

        System.out.println("La suma total es: " + sumaTotal);



        scanner.close();

    }

    public static int[] obtenerDigitos(int numero) {

        int[] digitos = new int[7];
        int indice = 0;

        while(numero > 0) {

            int digito = numero % 10;
            digitos[indice] = digito;

            indice++;
            numero /= 10;

        }

        return digitos;

    }
}
