import javax.swing.JOptionPane;

public class Ex07 {

    public static void main(String[] args) {
        
        String[] nomes = new String[21];
        int[] idades = new int[21];
        double[] pesos = new double[21];
        char[] sexos = new char[21];
        double[] alturas = new double[21];
        int[] quantidadeDeGolsMarcados = new int[21];
        int[] quantidadeDeCartoesAmarelosRecebidos = new int[21];
        int[] quantidadeDeCartoesVermelhosRecebidos = new int[21];

        int contadorSexoMasculino = 0;
        int contadorSexoFeminino = 0;

        int contador = 0;

        while (!(contador == 22)) {
            nomes[contador] = JOptionPane.showInputDialog("Informe o seu nome");
            idades[contador] = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));
            pesos[contador] = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso"));
            sexos[contador] = JOptionPane.showInputDialog("Informe o seu sexo (M/F)").toUpperCase().trim().charAt(0);
            while (sexos[contador] != 'M' && sexos[contador] != 'F') {
                sexos[contador] = JOptionPane.showInputDialog("Informe o seu sexo (M/F)").toUpperCase().trim().charAt(0);
            }
            if (sexos[contador] == 'M') {
                contadorSexoMasculino++;
            } else {
                contadorSexoFeminino++;
            }
            alturas[contador] = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura"));
            quantidadeDeGolsMarcados[contador] = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua quantidade de gols marcados"));
            quantidadeDeCartoesAmarelosRecebidos[contador] = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua quantidade de cartões amarelos recebidos"));
            quantidadeDeCartoesVermelhosRecebidos[contador] = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua quantidade de cartões vermelhos recebidos"));

            contador++;
        }

        String nomeDoMenorPeso = "";
        double menorPeso = Double.MAX_VALUE;

        if (pesos[0] < menorPeso) {
            nomeDoMenorPeso = nomes[0];
        } else if (pesos[1] < menorPeso) {
            nomeDoMenorPeso = nomes[1];
        } else if (pesos[2] < menorPeso) {
            nomeDoMenorPeso = nomes[2];
        } else if (pesos[3] < menorPeso) {
            nomeDoMenorPeso = nomes[3];
        } else if (pesos[4] < menorPeso) {
            nomeDoMenorPeso = nomes[4];
        } else if (pesos[5] < menorPeso) {
            nomeDoMenorPeso = nomes[5];
        } else if (pesos[6] < menorPeso) {
            nomeDoMenorPeso = nomes[6];
        } else if (pesos[7] < menorPeso) {
            nomeDoMenorPeso = nomes[7];
        } else if (pesos[8] < menorPeso) {
            nomeDoMenorPeso = nomes[8];
        } else if (pesos[9] < menorPeso) {
            nomeDoMenorPeso = nomes[9];
        } else if (pesos[10] < menorPeso) {
            nomeDoMenorPeso = nomes[10];
        } else if (pesos[11] < menorPeso) {
            nomeDoMenorPeso = nomes[11];
        } else if (pesos[12] < menorPeso) {
            nomeDoMenorPeso = nomes[12];
        } else if (pesos[13] < menorPeso) {
            nomeDoMenorPeso = nomes[13];
        } else if (pesos[14] < menorPeso) {
            nomeDoMenorPeso = nomes[14];
        } else if (pesos[15] < menorPeso) {
            nomeDoMenorPeso = nomes[15];
        } else if (pesos[16] < menorPeso) {
            nomeDoMenorPeso = nomes[16];
        } else if (pesos[17] < menorPeso) {
            nomeDoMenorPeso = nomes[17];
        } else if (pesos[18] < menorPeso) {
            nomeDoMenorPeso = nomes[18];
        } else if (pesos[19] < menorPeso) {
            nomeDoMenorPeso = nomes[19];
        } else if (pesos[20] < menorPeso) {
            nomeDoMenorPeso = nomes[20];
        } else if (pesos[21] < menorPeso) {
            nomeDoMenorPeso = nomes[21];
        }
        
        String nomeMaiorAltura = "";
        double maiorAltura = Double.MIN_VALUE;

        if (alturas[0] > maiorAltura) {
            nomeMaiorAltura = nomes[0];
        } else if (alturas[1] > maiorAltura) {
            nomeMaiorAltura = nomes[1];
        } else if (alturas[2] > maiorAltura) {
            nomeMaiorAltura = nomes[2];
        } else if (alturas[3] > maiorAltura) {
            nomeMaiorAltura = nomes[3];
        } else if (alturas[4] > maiorAltura) {
            nomeMaiorAltura = nomes[4];
        } else if (alturas[5] > maiorAltura) {
            nomeMaiorAltura = nomes[5];
        } else if (alturas[6] > maiorAltura) {
            nomeMaiorAltura = nomes[6];
        } else if (alturas[7] > maiorAltura) {
            nomeMaiorAltura = nomes[7];
        } else if (alturas[8] > maiorAltura) {
            nomeMaiorAltura = nomes[8];
        } else if (alturas[9] > maiorAltura) {
            nomeMaiorAltura = nomes[9];
        } else if (alturas[10] > maiorAltura) {
            nomeMaiorAltura = nomes[10];
        } else if (alturas[11] > maiorAltura) {
            nomeMaiorAltura = nomes[11];
        } else if (alturas[12] > maiorAltura) {
            nomeMaiorAltura = nomes[12];
        } else if (alturas[13] > maiorAltura) {
            nomeMaiorAltura = nomes[13];
        } else if (alturas[14] > maiorAltura) {
            nomeMaiorAltura = nomes[14];
        } else if (alturas[15] > maiorAltura) {
            nomeMaiorAltura = nomes[15];
        } else if (alturas[16] > maiorAltura) {
            nomeMaiorAltura = nomes[16];
        } else if (alturas[17] > maiorAltura) {
            nomeMaiorAltura = nomes[17];
        } else if (alturas[18] > maiorAltura) {
            nomeMaiorAltura = nomes[18];
        } else if (alturas[19] > maiorAltura) {
            nomeMaiorAltura = nomes[19];
        } else if (alturas[20] > maiorAltura) {
            nomeMaiorAltura = nomes[20];
        } else if (alturas[21] > maiorAltura) {
            nomeMaiorAltura = nomes[21];
        }

        String nomeMaiorNome = "";
        int maiorNome = Integer.MIN_VALUE;

        if (nomes[0].length() > maiorNome) {
            nomeMaiorNome = nomes[0];
        } else if (nomes[1].length() > maiorNome) {
            nomeMaiorNome = nomes[1];
        } else if (nomes[2].length() > maiorNome) {
            nomeMaiorNome = nomes[2];
        } else if (nomes[3].length() > maiorNome) {
            nomeMaiorNome = nomes[3];
        } else if (nomes[4].length() > maiorNome) {
            nomeMaiorNome = nomes[4];
        } else if (nomes[5].length() > maiorNome) {
            nomeMaiorNome = nomes[5];
        } else if (nomes[6].length() > maiorNome) {
            nomeMaiorNome = nomes[6];
        } else if (nomes[7].length() > maiorNome) {
            nomeMaiorNome = nomes[7];
        } else if (nomes[8].length() > maiorNome) {
            nomeMaiorNome = nomes[8];
        } else if (nomes[9].length() > maiorNome) {
            nomeMaiorNome = nomes[9];
        } else if (nomes[10].length() > maiorNome) {
            nomeMaiorNome = nomes[10];
        } else if (nomes[11].length() > maiorNome) {
            nomeMaiorNome = nomes[11];
        } else if (nomes[12].length() > maiorNome) {
            nomeMaiorNome = nomes[12];
        } else if (nomes[13].length() > maiorNome) {
            nomeMaiorNome = nomes[13];
        } else if (nomes[14].length() > maiorNome) {
            nomeMaiorNome = nomes[14];
        } else if (nomes[15].length() > maiorNome) {
            nomeMaiorNome = nomes[15];
        } else if (nomes[16].length() > maiorNome) {
            nomeMaiorNome = nomes[16];
        } else if (nomes[17].length() > maiorNome) {
            nomeMaiorNome = nomes[17];
        } else if (nomes[18].length() > maiorNome) {
            nomeMaiorNome = nomes[18];
        } else if (nomes[19].length() > maiorNome) {
            nomeMaiorNome = nomes[19];
        } else if (nomes[20].length() > maiorNome) {
            nomeMaiorNome = nomes[20];
        } else if (nomes[21].length() > maiorNome) {
            nomeMaiorNome = nomes[21];
        }











    }

}