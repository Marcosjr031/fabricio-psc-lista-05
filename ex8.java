
    import java.util.Scanner;

public class ex8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de N:");
        int N = scanner.nextInt();
        
        double H = 0.0;

        for (int i = 1; i <= N; i++) {
            H += 1.0 / i;
        }
        
        System.out.println("O valor de H é: " + H);
        scanner.close();
    }
}


