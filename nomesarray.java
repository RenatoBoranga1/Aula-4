import java.util.Scanner;

public class nomesarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = {"renato", "carla", "vando", "junior", "marcos"};

        System.out.print("Digite o nome que deseja buscar: ");
        String adivinha = input.nextLine();

        boolean existe = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(adivinha)) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("O nome " + adivinha + " existe no array.");
        } else {
            System.out.println("O nome " + adivinha + " não existe no array.");
        }
    }
}
