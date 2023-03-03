import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        
        double radio, area, longitud;
        Scanner leerporteclado = new Scanner (System.in);

        
        System.out.println("Ingrese el valor del radio");
        radio = leerporteclado.nextDouble(); 

        area = Math.PI * Math.pow(radio,2);
        longitud = 2 * Math.PI * radio;

        System.out.println("El area del circulo " + area);
        System.out.println("La longitud del circulo " + longitud);

    }
    
}
