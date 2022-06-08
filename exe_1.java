import java.util.Scanner;
    public class exe_1{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int h, b, B, area;
            
            System.out.println("Digite valor de altura: ");
            h = input.nextInt();
            System.out.println("Digite valor de base menor: ");
            b = input.nextInt();
            System.out.println("Digite valor de base maior: ");
            B = input.nextInt();

            area = (h*(b+B))/2;

            System.out.println("A area é de: " + area);           
             
    }
}