import javax.swing.JOptionPane;

public class Ex15 {

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
        int auxiliar = numero;


        int contadorAntecessoresPares = 0;
        int contadorSucessoresImpares = 0;

        int aux = 0;

        while (!(contadorAntecessoresPares == 50)) {
            contadorAntecessoresPares++;
            aux = numero--;
            if ((aux % 2) == 0) {
                System.out.println(aux);
            }
            numero--;
        }

        System.out.println("=======================================");
        aux = 0;
        numero = auxiliar;

        while (!(contadorSucessoresImpares == 50)) {
            contadorSucessoresImpares++;
            aux = numero++;
            if (!((aux % 2) == 0)) {
                System.out.println(aux);
            }
        }

    }

}