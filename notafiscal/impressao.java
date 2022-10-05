public class impressao {
        public static void main(String[] args) {
            float vtroco;
            float dinheiro;

            System.out.println("                      TANCA");
            System.out.println("        ");
            System.out.println("            TANCA INFORMATICA EIRELI");
            System.out.println("    RUA MARECHAL FLORIANO PEIXOTO, 166 VILA");
            System.out.println("         MARCONDES PRESIDENTE PRUDENTE");
            System.out.println("      CNPJ 08723218000186 IE 149626224113");
            System.out.println("        ");
            System.out.println("-------------------------------------------------");
            System.out.println("                 Extrato Nº 1208");
            System.out.println("           CUPOM FISCAL ELETRÔNICO - SAT");
            System.out.println("__________________________________________________");

            cliente c1 = new cliente();
            c1.nome = "Karen Stackoski e Joana Pereira";
            c1.cpf  = "223.546.987-68";

            System.out.println("CPF/CNPJ do Consumidor: " + c1.cpf);
            System.out.println("Razão Social/Nome: " + c1.nome);
            System.out.println("    ");
            System.out.println("__________________________________________________");

            produto p1 = new produto();
            p1.cod    = 1;
            p1.desc   = "ETANOL COMUM";
            p1.quant  = 2;
            p1.vunrs  = 9.654f;
            p1.vltrrs = 15.03f;
            p1.vitem  = 37.15f;
            
            System.out.println("#|COD|DESC|QTD|UN| VL UN R$|(VLTR R$) | VL ITEM R$");
            System.out.println(p1.cod + "     " + p1.quant + "            " + p1.vunrs + " x     3,85 (" + p1.vltrrs + ") ");
            System.out.println(p1.desc + "                                 " + p1.vitem);
            System.out.println("__________________________________________________");

            System.out.println("Subtotal:                                    " + p1.vitem);
            System.out.println("VALOR TOTAL R$:                              " + p1.vitem);

            dinheiro = 37.16f;
            vtroco   = p1.vitem - dinheiro;

            System.out.println("                                ");
            System.out.println("Dinheiro:                                    " + dinheiro);
            System.out.println("Troco:                               " + vtroco);
            System.out.println("           ");
            System.out.println("Valor aproximado dos Tributos                " + p1.vunrs);
            System.out.println("(Conforme Lei Fed. 12.741/2012)");
            System.out.println("* Valor Aproximado dos Tributos dos Itens");
            System.out.println("                         ");
            System.out.println("                  SAT Nº 900013491");
            System.out.println("                ");
            System.out.println("                15/07/2019 - 09:40:11");
        }
}
