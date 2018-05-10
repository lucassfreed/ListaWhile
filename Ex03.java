import javax.swing.JOptionPane;

public class Ex03 {

    public static void main(String[] args) {
        
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
        int contador = 0;

        while (!(peso < 0 || peso > 300)) {
            contador++;
            peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));

        }
        System.out.println("Quantidade de pessoas que informaram o peso: " + contador);
    
    }
}