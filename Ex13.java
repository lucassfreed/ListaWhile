import javax.swing.JOptionPane;

public class Ex13 {

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
        int contador = 0;

        while (!(contador == 1000)) {
            contador++;

            System.out.println(numero + " x " + contador + " = " + (numero * contador));
        }

    }
}