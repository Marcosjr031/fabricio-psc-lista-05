
    import java.util.Scanner;
public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.println("Digite o número de cidades:");
        n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Número de cidades inválido.");
         
    
        }
        
        String cidadeMaiorIndice = "";
        int maiorIndice = Integer.MIN_VALUE;
        String cidadeMenorIndice = "";
        int menorIndice = Integer.MAX_VALUE;
        
        int totalVeiculos = 0;
        
        for (int i = 1; i <= n; i++) {

            System.out.println("Digite o nome da cidade " + i + ":");
            String nomeCidade = scanner.next();
            System.out.println("Digite o número de veículos de passeio na cidade " + i + ":");
            int veiculos = scanner.nextInt();
            System.out.println("Digite o número de acidentes de trânsito com vítimas na cidade " + i + ":");
            int acidentes = scanner.nextInt();
            
            if (acidentes > maiorIndice) {
                maiorIndice = acidentes;
                cidadeMaiorIndice = nomeCidade;
            }
            if (acidentes < menorIndice) {
                menorIndice = acidentes;
                cidadeMenorIndice = nomeCidade;
            }
            

            totalVeiculos += veiculos;
        }

        double mediaVeiculos = (double) totalVeiculos / n;

        System.out.println("Maior índice de acidentes de trânsito: " + maiorIndice + ", pertencente à cidade de " + cidadeMaiorIndice);
        System.out.println("Menor índice de acidentes de trânsito: " + menorIndice + ", pertencente à cidade de " + cidadeMenorIndice);
        System.out.println("Média de veículos nas " + n + " cidades: " + mediaVeiculos);
        scanner.close();
    }
}



