import javax.swing.JOptionPane;

public class Ex07 {

    public static void main(String[] args) {
        
        String nome = "";
        int idade = 0;
        double peso = 0;
        char sexo = 0;
        double altura = 0;
        int quantidadeDeGolsMarcados = 0;
        int quantidadeDeCartoesAmarelosRecebidos = 0;
        int quantidadeDeCartoesVermelhosRecebidos = 0;

        int contadorSexoMasculino = 0;
        int contadorSexoFeminino = 0;

        int contador = 0;

        String nomeDoMenorPeso = "";
        double menorPeso = Double.MAX_VALUE;

        String nomeMaiorAltura = "";
        double maiorAltura = Double.MIN_VALUE;

        String nomeMaiorNome = "";
        int maiorNome = Integer.MIN_VALUE;

        String nomeMenorJogadorQuantidadeCartaoAmarelosRecebidos = "";
        int menorJogadorQuantidadeCartaoAmarelosRecebidos = Integer.MAX_VALUE;

        String nomeMenorNome = "";
        int menorNome = Integer.MAX_VALUE;

        String nomeMaiorPeso = "";
        double maiorPeso = Double.MIN_VALUE;

        String nomeMaiorJogadorQuantidadeCartaoVermelhosRecebidos = "";
        int maiorJogadorQuantidadeCartaoVermelhosRecebidos = Integer.MIN_VALUE;

        String nomeMaiorJogadorQuantidadeCartaoAmarelosRecebidos = "";
        int maiorJogadorQuantidadeCartaoAmarelosRecebidos = Integer.MIN_VALUE;

        String nomeMenorJogadorQuantidadeCartaoVermelhosRecebidos = "";
        int menorJogadorQuantidadeCartaoVermelhosRecebidos = Integer.MAX_VALUE;

        while (!(contador == 22)) {
            nome = JOptionPane.showInputDialog("Informe o seu nome");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso"));
            sexo = JOptionPane.showInputDialog("Informe o seu sexo (M/F)").toUpperCase().trim().charAt(0);
            while (sexo != 'M' && sexo != 'F') {
                sexo = JOptionPane.showInputDialog("Informe o seu sexo (M/F)").toUpperCase().trim().charAt(0);
            }
            if (sexo == 'M') {
                contadorSexoMasculino++;
            } else {
                contadorSexoFeminino++;
            }
            altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura"));
            quantidadeDeGolsMarcados = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua quantidade de gols marcados"));
            quantidadeDeCartoesAmarelosRecebidos = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua quantidade de cartões amarelos recebidos"));
            quantidadeDeCartoesVermelhosRecebidos = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua quantidade de cartões vermelhos recebidos"));
            if (peso < menorPeso) {
                nomeDoMenorPeso = nome;
                menorPeso = peso;
            }

            if (altura > maiorAltura) {
                nomeMaiorAltura = nome;
                maiorAltura = altura;
            }

            if (nome.length() > maiorNome) {
                nomeMaiorNome = nome;
                maiorNome = nome.length();
            }

            if (quantidadeDeCartoesAmarelosRecebidos < menorJogadorQuantidadeCartaoAmarelosRecebidos) {
                nomeMenorJogadorQuantidadeCartaoAmarelosRecebidos = nome;
                menorJogadorQuantidadeCartaoAmarelosRecebidos = quantidadeDeCartoesAmarelosRecebidos;
            }

            if (peso > maiorPeso) {
                nomeMaiorPeso = nome;
                maiorPeso = peso;
            }

            if (peso > maiorPeso) {
                nomeMaiorPeso = nome;
                maiorPeso = peso;
            }

            if (quantidadeDeCartoesVermelhosRecebidos > maiorJogadorQuantidadeCartaoVermelhosRecebidos) {
                nomeMaiorJogadorQuantidadeCartaoVermelhosRecebidos = nome;
                maiorJogadorQuantidadeCartaoVermelhosRecebidos = quantidadeDeCartoesVermelhosRecebidos;
            }

            if (quantidadeDeCartoesAmarelosRecebidos > maiorJogadorQuantidadeCartaoAmarelosRecebidos) {
                nomeMaiorJogadorQuantidadeCartaoAmarelosRecebidos = nome;
                maiorJogadorQuantidadeCartaoAmarelosRecebidos = quantidadeDeCartoesAmarelosRecebidos;
            }

            if (quantidadeDeCartoesVermelhosRecebidos < menorJogadorQuantidadeCartaoVermelhosRecebidos) {
                nomeMaiorJogadorQuantidadeCartaoVermelhosRecebidos = nome;
                menorJogadorQuantidadeCartaoVermelhosRecebidos = quantidadeDeCartoesVermelhosRecebidos;
            }
            contador++;
        } 

        JOptionPane.showMessageDialog(null, "O jogador com o menor peso: " + nomeDoMenorPeso +
            "\nO jogador com a maior altura: " + nomeMaiorAltura + 
            "\nO jogador com o maior nome: " + nomeMaiorNome + 
            "\nA quantidade de jogadores do sexo F: " + contadorSexoFeminino +
            "\nA quantidade de jogadores do sexo M: " + contadorSexoMasculino +
            "\nO jogador com a menor quantidade de cartões amarelos recebidos: " + nomeMenorJogadorQuantidadeCartaoAmarelosRecebidos +
            "\nO jogador com o menor nome: " + nomeMenorNome + 
            "\nO jogador com o maior peso: " + nomeMaiorPeso +
            "\nO jogador com a maior quantidade de cartões vermelhos recebidos: " + nomeMaiorJogadorQuantidadeCartaoVermelhosRecebidos +
            "\nO jogador com a maior quantidade de cartões amarelos recebidos: " + nomeMaiorJogadorQuantidadeCartaoAmarelosRecebidos +
            "\nO jogador com a menor quantidade de cartões vermelhos recebidos: " + nomeMenorJogadorQuantidadeCartaoVermelhosRecebidos);

        











    }

}