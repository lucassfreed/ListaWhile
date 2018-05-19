import javax.swing.JOptionPane;

public class Ex05 {

    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));
        int resultado = 0;

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n\n"
        + "1 - Somar\n" 
        + "2 - Subtrair\n"
        + "3 - Multiplicar\n"
        + "4 - Dividir\n"
        + "5 - Sair"));

        while (opcao > 5 || opcao < 1) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n\n"
        + "1 - Somar\n" 
        + "2 - Subtrair\n"
        + "3 - Multiplicar\n"
        + "4 - Dividir\n"
        + "5 - Sair"));

        }

        while (!(opcao == 5)) {
            if (opcao == 1) {
                resultado = (numero1 + numero2); 
                JOptionPane.showInputDialog(null, "Operação: " + numero1 + " + " + numero2 + 
                "\nO resultado da operação é: " + resultado);
            } else if (opcao == 2) {
                resultado = (numero1 - numero2);
                JOptionPane.showInputDialog(null, "Operação: " + numero1 + " - " + numero2 + 
                "\nO resultado da operação é: " + resultado); 
            } else if (opcao == 3) {
                resultado = (numero1 * numero2);
                JOptionPane.showInputDialog(null, "Operação: " + numero1 + " x " + numero2 + 
                "\nO resultado da operação é: " + resultado); 
            } else if (opcao == 4) {
                resultado = (numero1 / numero2);
                JOptionPane.showInputDialog(null, "Operação: " + numero1 + " / " + numero2 + 
                "\nO resultado da operação é: " + resultado); 
            }

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n\n"
        + "1 - Somar\n" 
        + "2 - Subtrair\n"
        + "3 - Multiplicar\n"
        + "4 - Dividir\n"
        + "5 - Sair"));

        }
        
        
    }

}