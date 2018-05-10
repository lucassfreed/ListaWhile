import javax.swing.JOptionPane;

public class Ex04 {

    public static void main(String[] args) {

        int quantidadeDeCarros = Integer.parseInt(JOptionPane.showInputDialog
        ("Informe a quantidade de carro que você deseja"));

        double valorDoCarro = 0;
        int anoDoCarro = 0;
        String modeloDoCaarro = "";

        int contador = 0;

        while (!(contador == quantidadeDeCarros)) {
            contador++;

            valorDoCarro = Double.parseDouble(JOptionPane.showInputDialog
            ("Informe o valor do carro"));

            modeloDoCaarro = JOptionPane.showInputDialog("Informe ");


        }

    }

}