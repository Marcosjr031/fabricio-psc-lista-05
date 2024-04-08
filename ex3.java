
    import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            
            System.out.println("Menu de opções:");
            System.out.println("1. Média aritmética");
            System.out.println("2. Média ponderada");
            System.out.println("3. Sair");
            System.out.println("Digite a opção desejada:");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    mediaAritmetica();
                    break;
                case 2:
                    mediaPonderada();
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 3);
scanner.close();

    }
    
    public static void mediaAritmetica() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as duas notas:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        System.out.println("Média aritmética: " + media);
        scanner.close();
    }
    

    public static void mediaPonderada() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as três notas:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        
        System.out.println("Digite os pesos das notas:");
        double peso1 = scanner.nextDouble();
        double peso2 = scanner.nextDouble();
        double peso3 = scanner.nextDouble();
        
        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        System.out.println("Média ponderada: " + media);
        scanner.close();
    }
   
}


