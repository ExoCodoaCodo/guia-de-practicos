
import java.util.Scanner;

public class poo6 {

    public static void main(String[] args) {
        System.out.println("Ingrese un número entero: ");
        int num;
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        System.out.println("Tabla de multiplicar: ");
        for (int i = 1; i <= 12; i++) {
            System.out.println(+num + "x" + i + "= " + num * i);
        }

    }

}
