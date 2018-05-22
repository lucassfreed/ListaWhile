import javax.swing.JOptionPane;

public class Ex10 {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("Informe o texto");

        int quantidadeDeCaracteres = texto.length();
        int contador = 0;
        char[] letras = new char[quantidadeDeCaracteres];

        while (!(contador == quantidadeDeCaracteres)) {
            letras[contador] = texto.charAt(contador);
            System.out.println(letras[contador] + " = " + (contador + 1));
            contador++;

        }
        
    }
}