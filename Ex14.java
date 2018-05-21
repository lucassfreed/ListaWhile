import javax.swing.JOptionPane;

public class Ex14 {

    public static void main(String[] args) {
    
        int numero = Integer.parseInt(JOptionPane.showInputDialog
        ("Informe o número"));

        while (!(numero == 0)) {
            System.out.println(numero--);
            
        }

    }
}