import javax.swing.JOptionPane;

public class Ex04 {

    public static void main(String[] args) {

        int quantidadeDeCarros = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros que você deseja"));

        double valorDoCarro = 0;
        int anoDoCarro = 0;
        String modeloDoCarro = "";

        double mediaDosAnosDosCarros = 0;
        double mediaDosValoresDosCarros = 0;
        

        int contador = 0;
        int contadorDeCarrosG = 0;
        int contadorDeCarrosA = 0;

        while (!(contador == quantidadeDeCarros)) {
            contador++;

            valorDoCarro = valorDoCarro + Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro"));

            modeloDoCarro = JOptionPane.showInputDialog("Informe o modelo do carro");

            anoDoCarro = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro"));

            if (modeloDoCarro.toUpperCase().charAt(0) == 'G') {
                contadorDeCarrosG++;
            } else if (modeloDoCarro.toUpperCase().charAt(0) == 'A') {
                contadorDeCarrosA++;
            }

            mediaDosAnosDosCarros = mediaDosAnosDosCarros + anoDoCarro;
            mediaDosValoresDosCarros = mediaDosValoresDosCarros + valorDoCarro;

        }

        mediaDosAnosDosCarros = mediaDosAnosDosCarros / contador;
        mediaDosValoresDosCarros = mediaDosValoresDosCarros / contador;

        JOptionPane.showMessageDialog(null, "Média do ano dos carros: " + mediaDosAnosDosCarros + 
                      "\nMédia do valor dos carros: " + mediaDosValoresDosCarros + 
                      "\nQuantidade de carros que começam com a letra G: " + contadorDeCarrosG + 
                      "\nQuantidade de carros que começam com a letra A: " + contadorDeCarrosA);

    }

}