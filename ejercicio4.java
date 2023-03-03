import java.util.Scanner; //al usar scanner importar libreria

public class ejercicio4 {

    public static void main(String[] args) {
        
        int juan, ana, alber, mama;
        Scanner entrada = new Scanner (System.in); //para leer entrada de datos
        
        System.out.println("Ingrese su edad");
        juan = entrada.nextInt(); //para leer la entrada de datos

        alber = 2 * (juan/3);
        ana = 4 * (juan/3);
        mama = alber + juan + ana;
        
        System.out.println("La edad de Juan: "+ juan);
        System.out.println("La edad de Alberto: "+ alber);
        System.out.println("La edad de Ana: "+ ana);
        System.out.println("La edad de la mama: "+ mama);

    }
    
}
  