    import java.util.Scanner;

public class ex6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
           
            System.out.println("Menu de opções:");
            System.out.println("1. Imposto");
            System.out.println("2. Novo salário");
            System.out.println("3. Classificação");
            System.out.println("4. Finalizar o programa");
            System.out.println("Digite a opção desejada:");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    calcularImposto();
                    break;
                case 2:
                    calcularNovoSalario();
                    break;
                case 3:
                    classificarSalario();
                    break;
                case 4:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
    
   
    public static void calcularImposto() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();
        
        double imposto;
        if (salario < 1400.00) {
            imposto = salario * 0.05;
        } else if (salario >= 1400.00 && salario <= 2500.00) {
            imposto = salario * 0.10;
        } else {
            imposto = salario * 0.15;
        }
        
        System.out.println("Valor do imposto: " + imposto);
        scanner.close();
    }
    
  
    public static void calcularNovoSalario() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();
        
        double aumento;
        if (salario > 5000.00) {
            aumento = 25.00;
        } else if (salario >= 2500.00) {
            aumento = 50.00;
        } else if (salario >= 1400.00) {
            aumento = 75.00;
        } else {
            aumento = 100.00;
        }
        
        double novoSalario = salario + aumento;
        System.out.println("Novo salário: " + novoSalario);
        scanner.close();
    }
    
 
    public static void classificarSalario() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();
        
        if (salario <= 1400.00) {
            System.out.println("Classificação: Mal remunerado");
        } else {
            System.out.println("Classificação: Bem remunerado");
            
        }
        scanner.close();
    }
}


