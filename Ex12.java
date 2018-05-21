import javax.swing.JOptionPane;

public class Ex12 {

    public static void main(String[] args) {

        String nomeDoProduto = "";
        double valorDoProduto = 0;
        int quantidadeDeProdutos = 0;

        while (quantidadeDeProdutos < 5) {
            nomeDoProduto = JOptionPane.showInputDialog
            ("Informe o nome do produto. (Digite para 'sair' para finalizar o processo)")
            .trim();

            valorDoProduto = Double.parseDouble(JOptionPane.showInputDialog
            ("Informe o valor do produto"));

            quantidadeDeProdutos = Integer.parseInt(JOptionPane.showInputDialog
            ("Informe a quantidade de produtos"));
        }

        double valorTotal = (valorDoProduto * quantidadeDeProdutos);
        valorTotal = (valorTotal - 150.00);

    }
}

