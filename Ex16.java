public class Ex16 {

    public static void main(String[] args) {
        
        int numero1 = 23;
        int numero2 = 60;
        int numero3 = 60;


            while (numero1 > -1) {
                numero2 = 59;
                numero3 = 59;

                while (numero2 > -1) {
                    numero3 = 59;
                    while (numero3 > -1) {

                    if (numero3 <= 9 && numero2 <= 9 && numero1 <= 9) {
                        System.out.println("0" + numero1 + ":0" + numero2 + ":0" + numero3);
                    } else if (numero3 <= 9 && numero2 <= 9) {
                        System.out.println(numero1 + ":0" + numero2 + ":0" + numero3); 
                    } else if (numero3 <= 9 && numero1 <= 9) {
                        System.out.println("0" + numero1 + ":" + numero2 + ":0" + numero3); 
                    } else if (numero2 <= 9 && numero1 <= 9) {
                        System.out.println("0" + numero1 + ":0" + numero2 + ":" + numero3); 
                    } else if (numero3 <= 9) {
                        System.out.println(numero1 + ":" + numero2 + ":0" + numero3);  
                    } else if (numero2 <= 9) {
                        System.out.println(numero1 + ":0" + numero2 + ":" + numero3); 
                    } else if (numero1 <= 9) {
                        System.out.println("0" + numero1 + ":" + numero2 + ":" + numero3); 
                    } else {
                        System.out.println(numero1 + ":" + numero2 + ":" + numero3);
                    }
            
                    numero3--;
                }
                numero2--;
            }
            numero1--;
        }

    }

}