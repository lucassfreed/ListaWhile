import javax.swing.JOptionPane;

public class Ex02 {

    public static void main(String[] args) {
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));

        while (!(idade > 128)) {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
        }

    }

}