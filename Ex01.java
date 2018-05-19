import javax.swing.JOptionPane;

public class Ex01 {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Informe o nome (Digite fim para sair)");

        while (!(nome.equals("fim"))) {
            nome = JOptionPane.showInputDialog("Informe o nome (Digite fim para sair)");
            
        }

    }
    
}