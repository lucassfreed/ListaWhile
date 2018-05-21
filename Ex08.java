import javax.swing.JOptionPane;

public class Ex08 {

    public static void main(String[] args) {
        
        int quantidadeDeCaracteres = Integer.parseInt(JOptionPane.showInputDialog
        ("Informe a quantidade de caracteres que serão digitados"));

        int contador = 0;
        char[] caracteres = new char[quantidadeDeCaracteres];

        while (!(contador == quantidadeDeCaracteres)) {
            contador++;

            caracteres[contador - 1] = JOptionPane.showInputDialog
            ("Informe o " + (contador) + "º caracter").charAt(0);
        }

        contador = 0;
        while (!(contador == quantidadeDeCaracteres)) {
            System.out.println("Caracter: " + caracteres[contador]);
            contador++;

        }

    }

}