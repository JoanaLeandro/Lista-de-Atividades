import java.util.Scanner;
    public class exe_2{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float h, b, B, area;

            System.out.println("Digite o valor da area: ");
            h = input.nextFloat();
            System.out.println("Digite o valor da base menor: ");
            b = input.nextFloat();
            System.out.println("Digite o valor da base maior: ");
            B = input.nextFloat();

            area = (h*(b+B))/2;

            System.out.println("O valor da area é: " + area);
        }
    }