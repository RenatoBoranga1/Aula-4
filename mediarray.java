public class mediarray {
    public static void main(String[] args) {
        int[] notas = {10, 20, 30, 40, 50};

        double soma = 0;
        for (int numero : notas) {
            soma += numero;
        }
        
        double media = soma / notas.length;

        System.out.printf("A média dos números é: %.2f\n", media);
    }
}
