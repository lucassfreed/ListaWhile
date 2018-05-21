public class Ex16 {

    public static void main(String[] args) {
        
        int numero1 = 23;
        int numero2 = 59;
        int numero3 = 59;

        while (numero3 != 00 && numero2 <= 59) {

            numero3--;
            if (numero3 <= 9) {
                System.out.println(numero1 + ":" + numero2 + ":0" + numero3);
            } else {
                System.out.println(numero1 + ":" + numero2 + ":" + numero3);
            }
            if (numero3 == 0) {
                numero3 = 59;
                numero2--;
            }

        }

        while (numero2 != 00 && numero1 <= 24) {

            if (numero2 <= 9) {
                System.out.println(numero1 + ":0" + numero2 + ":0" + numero3);
            } else if (numero3 <= 9) {
                    System.out.println(numero1 + ":" + numero2 + ":0" + numero3);
            } else if (numero2 <= 9 && numero3 <= 9) {
                System.out.println(numero1 + ":0" + numero2 + ":0" + numero3);
            } else {
                System.out.println(numero1 + ":" + numero2 + ":" + numero3);
            }
            numero2--;

            if (numero2 <= 0) {
                numero2 = Integer.parseInt("00");
            }

        }

        while (numero1 != 00) {

            if (numero1 <= 9) {
                System.out.println("0" + numero1 + ":0" + numero2 + ":0" + numero3);
            } else if (numero2 <= 9) {
                System.out.println(numero1 + ":0" + numero2 + ":0" + numero3);
            } else if (numero3 <= 9) {
                    System.out.println(numero1 + ":" + numero2 + ":0" + numero3);
            } else if (numero2 <= 9 && numero3 <= 9) {
                System.out.println(numero1 + ":0" + numero2 + ":0" + numero3);
            } else {
                System.out.println(numero1 + ":" + numero2 + ":" + numero3);
            }
            numero1--;
        }

    }
}