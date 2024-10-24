
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado();


        System.out.println("Información del Empleado 1");
        System.out.println("Nombre: "+e1.getNombre()+"\nEdad: "+e1.getEdad()+"\nSalario: "+e1.getSalario());

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la siguiente información ");
        System.out.print("Ingrese el nombre del empleado 2: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad del empleado 2: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese el salario del empleado 2: ");
        double salario = sc.nextDouble();

        Empleado e2 = new Empleado(nombre, edad, salario);
        System.out.println("Información del Empleado 2");
        System.out.println("Nombre: "+e2.getNombre()+"\nEdad: "+e2.getEdad()+"\nSalario: "+e2.getSalario());
    }

}