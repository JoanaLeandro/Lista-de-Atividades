import javax.swing.JOptionPane;
public class exercicio_10{

    public static void main(String[] args){
        
        ///String aux = "";
        String dia= JOptionPane.showInputDialog("Digite");
        if(dia != null ){
            try{
                int diadasemana= Integer.parseInt(dia);
                if (diadasemana == 1)
                    dia = "Domingo";

                else if (diadasemana == 2)
                dia = "Segunda";

                else if (diadasemana == 3)
                dia = "Terça";

                else if (diadasemana == 4)
                dia = "Quarta";

                else if (diadasemana == 5)
                dia = "Quinta";

                else if (diadasemana == 6)
                dia = "Sexta";

                else if (diadasemana == 7)
                dia = "Sabado";

                else 
                    dia = "Desconheço";
                    JOptionPane.showMessageDialog(null, dia);
                } 
                catch (NumberFormatException erro){
                    JOptionPane.showMessageDialog(null, "Formato inválido");
                 } 
                        }

        }
        
        }
    
