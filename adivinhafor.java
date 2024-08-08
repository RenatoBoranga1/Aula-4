import java.util.Scanner;

public class adivinhafor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minimo = 0;
        int maximo = 100;
        int numero;

        System.out.println("Pense em um número entre 0 e 100 e eu vou tentar adivinhar!");

        for (int i = 0; i < 7; i++) { 
            numero = (minimo + maximo) / 2;
            System.out.println("O seu número é maior que " + numero + "? (1 para sim, 2 para não, 3 para igual)");
            int resposta = input.nextInt();

            if (resposta == 1) {
                minimo = numero + 1; 
            } else if (resposta == 2) {
                maximo = numero - 1; 
            } else if (resposta == 3) {
                System.out.println("Adivinhei! O número é " + numero);
                break;
            } else {
                System.out.println("Resposta inválida. Por favor, responda com 1, 2 ou 3.");
            }

            if (minimo > maximo) {
                System.out.println("O número que você pensou não está dentro do intervalo. Por favor, tente novamente.");
                break;
            }
        }

    }
}

