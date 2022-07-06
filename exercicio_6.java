import java.lang.management.ThreadInfo;
import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hora;
        float valor;

        System.out.println("Digite as horas de trabalho: ");
        hora = input.nextInt();

        valor = hora * 10.25f;
        
        System.out.println("O salario de acordo com as horas de trabalho é: " + valor);

        if (valor < 50f) {
            System.out.println("Atenção, dirija-se à direção do Hotel");

        }
        

    }
}