import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        
        double numero, cuadrado, cubo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor del numero");
        numero = entrada.nextDouble();

        cuadrado = Math.pow(numero,2);
        cubo = Math.pow(numero,3);

        System.out.println("El cuadrado del numero es: " + cuadrado);
        System.out.println("El cubo del nuero es: " + cubo);

    }
    
}
