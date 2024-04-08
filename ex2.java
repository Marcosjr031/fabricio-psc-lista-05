
    
import java.util.Scanner;
public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 0;
        int[] audiencia = new int[4];
        
        System.out.println("Digite o número do canal (4, 5, 7, 12) e o número de pessoas assistindo:");
        
        while (true) {
            int canal = scanner.nextInt();
            if (canal == 0) {
                break;
            }
            int pessoas = scanner.nextInt();
            if (canal >= 4 && canal <= 12) {
                audiencia[canal - 4] += pessoas;
                totalPessoas += pessoas;
            } else {
                System.out.println("Canal inválido! Por favor, digite um número de canal válido (4, 5, 7, 12).");
            }
        }
       
        for (int i = 0; i < 4; i++) {
            double porcentagem = (double) audiencia[i] / totalPessoas * 100;
            System.out.println("Canal " + (i + 4) + ": " + porcentagem + "%");
        }
        scanner.close();
    }

}
