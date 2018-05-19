import javax.swing.JOptionPane;

public class Ex06 {

    public static void main(String[] args) {

        int quantidadeDeBolosEscolhidos = 0;
        int quantidadeDeDocesEscolhidos = 0;
        int quantidadeDeSanEscolhidos = 0;
        int quantidadeDePizzasEscolhidas = 0;
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Código     Tipo                                                            Nome                                                                                                                       Valor\n" +
                "1                Bolos                                                         Bolo Brigadeiro                                                                                                      R$ 29,50\n" + 
                "2                Bolos                                                         Bolo Floresta Negra                                                                                               R$ 2,00\n" + 
                "3                Bolos                                                         Bolo Leite com Nutella                                                                                           R$ 29,23\n" + 
                "4                Bolos                                                         Bolo Mousse de Chocolate                                                                                   R$ 7,10\n" + 
                "5                Bolos                                                         Bolo Nega Maluca                                                                                                   R$ 19,33\n" + 
                "6                Doces                                                        Bomba de Creme                                                                                                    R$ 17,71\n" + 
                "7                Doces                                                        Bomba de Morango                                                                                                R$ 4,82\n" + 
                "8                Sanduíches                                              Filé-Mignon com fritas e cheddar                                                                         R$ 21,16\n" +
                "9                Sanduíches                                              Hambúrguer com queijos, champignon e rúcula                                                R$ 12,70\n" + 
                "10              Sanduíches                                              Provolone com salame                                                                                           R$ 19,70\n" +
                "11              Sanduíches                                              Vegetariano de berinjela                                                                                       R$ 28,22\n" + 
                "12              Pizzas                                                       Calabresa                                                                                                                 R$ 8,98\n" + 
                "13              Pizzas                                                       Napolitana                                                                                                                R$ 0,42\n" + 
                "14              Pizzas                                                       Peruana                                                                                                                    R$ 18,36\n" + 
                "15              Pizzas                                                       Portuguesa                                                                                                              R$ 27,50\n" + 
                "16                                                                                Sair"));

        while (!(opcao == 16)) {

            if (opcao == 1) {
                quantidadeDeBolosEscolhidos++;
            } else if (opcao == 2) {
                quantidadeDeBolosEscolhidos++;
            } else if (opcao == 3) {
                quantidadeDeBolosEscolhidos++;
            } else if (opcao == 4) {
                quantidadeDeBolosEscolhidos++;
            } else if (opcao == 5) {
                quantidadeDeDocesEscolhidos++;
            } else if (opcao == 6) {
                quantidadeDeDocesEscolhidos++;
            } else if (opcao == 7) {
                quantidadeDeSanEscolhidos++;
            } else if (opcao == 8) {
                quantidadeDeSanEscolhidos++;
            } else if (opcao == 9) {
                quantidadeDeSanEscolhidos++;
            } else if (opcao == 10) {
                quantidadeDeSanEscolhidos++;
            } else if (opcao == 11) {
                quantidadeDeSanEscolhidos++;
            } else if (opcao == 12) {
                quantidadeDePizzasEscolhidas++;
            } else if (opcao == 13) {
                quantidadeDePizzasEscolhidas++;
            } else if (opcao == 14) {
                quantidadeDePizzasEscolhidas++;
            } else if (opcao == 15) {
                quantidadeDePizzasEscolhidas++;
            }
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Código     Tipo                                                            Nome                                                                                                                       Valor\n" +
                "1                Bolos                                                         Bolo Brigadeiro                                                                                                      R$ 29,50\n" + 
                "2                Bolos                                                         Bolo Floresta Negra                                                                                               R$ 2,00\n" + 
                "3                Bolos                                                         Bolo Leite com Nutella                                                                                           R$ 29,23\n" + 
                "4                Bolos                                                         Bolo Mousse de Chocolate                                                                                   R$ 7,10\n" + 
                "5                Bolos                                                         Bolo Nega Maluca                                                                                                   R$ 19,33\n" + 
                "6                Doces                                                        Bomba de Creme                                                                                                    R$ 17,71\n" + 
                "7                Doces                                                        Bomba de Morango                                                                                                R$ 4,82\n" + 
                "8                Sanduíches                                              Filé-Mignon com fritas e cheddar                                                                         R$ 21,16\n" +
                "9                Sanduíches                                              Hambúrguer com queijos, champignon e rúcula                                                R$ 12,70\n" + 
                "10              Sanduíches                                              Provolone com salame                                                                                           R$ 19,70\n" +
                "11              Sanduíches                                              Vegetariano de berinjela                                                                                       R$ 28,22\n" + 
                "12              Pizzas                                                       Calabresa                                                                                                                 R$ 8,98\n" + 
                "13              Pizzas                                                       Napolitana                                                                                                                R$ 0,42\n" + 
                "14              Pizzas                                                       Peruana                                                                                                                    R$ 18,36\n" + 
                "15              Pizzas                                                       Portuguesa                                                                                                              R$ 27,50\n" + 
                "16                                                                                Sair"));

        }

        double mediaDosProdutos = (quantidadeDeBolosEscolhidos + quantidadeDeDocesEscolhidos + quantidadeDeSanEscolhidos + quantidadeDePizzasEscolhidas) /4;

        JOptionPane.showMessageDialog(null, "Quantidade de bolos escolhidos: " + quantidadeDeBolosEscolhidos + 
            "\nQuantidade de doces escolhidos: " + quantidadeDeDocesEscolhidos +
            "\nQuantidade de Sanduíches escolhidos: " + quantidadeDeSanEscolhidos +
            "\nQuantidade de Pizzas escolhidas: " + quantidadeDePizzasEscolhidas  + 
            "\nMédia dos produtos: " + mediaDosProdutos);

    }

}