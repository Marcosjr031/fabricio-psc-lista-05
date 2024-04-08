import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalIdades = 0;
        int countPesoAltura = 0;
        int countIdadeAltura = 0;
        int countPessoas = 0;
        
        System.out.println("Digite as idades, pesos e alturas das dez pessoas:");
        

        for (int i = 0; i < 10; i++) {
            int idade = scanner.nextInt();
            double peso = scanner.nextDouble();
            double altura = scanner.nextDouble();
            
           
            totalIdades += idade;
            
            
            if (peso > 90 && altura < 1.50) {
                countPesoAltura++;
            }
            
            if (idade >= 10 && idade <= 30 && altura > 1.90) {
                countIdadeAltura++;
            }
            
            countPessoas++;
        }
        
   
        double mediaIdades = (double) totalIdades / countPessoas;
        
      
        double porcentagemIdadeAltura = (double) countIdadeAltura / countPessoas * 100;
        
      
        System.out.println("Média das idades das dez pessoas: " + mediaIdades);
        System.out.println("Quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 m: " + countPesoAltura);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m: " + porcentagemIdadeAltura + "%");

        scanner.close();
    }
}
