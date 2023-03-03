import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        
        double horastrabajadas, valorhora, retencion, salariobruto, salarioneto;
        Scanner leerporteclado = new Scanner (System.in); 
        
        System.out.println("Ingrese las horas trabajadas");
        horastrabajadas = leerporteclado.nextDouble(); 

        System.out.println("Ingrese el valor de la hora");
        valorhora = leerporteclado.nextDouble(); 

        retencion = 0.125;
        salariobruto = horastrabajadas * valorhora;
        salarioneto = salariobruto - (salariobruto * retencion);

        System.out.println("El salario bruto es: " + salariobruto);
        System.out.println("El salario neto es: " + salarioneto);

    }
    
}
