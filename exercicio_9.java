import java.util.Scanner;
import javax. swing.JOptionPane;
public class exercicio_9 {
    
    
    public static void main(String[] args){
        Scanner var = new Scanner(System.in);
        float n1, n2, media;
     
        System.out.println("Digite nota1: ");
        n1 = var.nextFloat();
        System.out.println("Digite nota2: ");
        n2 = var.nextFloat();
        media = (n1+n2)/2;
        JOptionPane.showMessageDialog(null, "media: " + media);

    }
}