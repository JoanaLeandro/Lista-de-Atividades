public class Exercicio_8 {

    public static void main(String[] args) {    
        for (int i = 2; i <= 123; i++) {
            if( Primo(i) )
                System.out.println(i + " é primo.");
        }    
    }
 
    private static boolean Primo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}