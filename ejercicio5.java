public class ejercicio5 {

    public static void main(String[] args) {
        
        double suma, x, y;
        suma = 0;
        x = 20;
        suma = suma + x;
        y = 40;
        x = x + (Math.pow(y,2));
        suma = suma + x / y;

        System.out.println("El valor de la suma es: " + suma);

    }
    
}
