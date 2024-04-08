
    import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSim = 0;
        int totalNao = 0;
        int mulheresSim = 0;
        int homens = 0;
        int homensNao = 0;
        
        System.out.println("Digite o sexo (M — masculino; ou F — feminino) e a resposta (S — sim; ou N — não) das dez pessoas:");
        
        for (int i = 0; i < 10; i++) {
            char sexo = scanner.next().charAt(0);
            char resposta = scanner.next().charAt(0);
            
            if (resposta == 'S') {
                totalSim++;
                if (sexo == 'F') {
                    mulheresSim++;
                }
            } else {
                totalNao++;
                if (sexo == 'M') {
                    homens++;
                    homensNao++;
                }
            }
            
            if (sexo == 'M') {
                homens++;
            }
        }
        
       
        double porcentagemHomensNao = (double) homensNao / homens * 100;
        
    
        System.out.println("Número de pessoas que responderam sim: " + totalSim);
        System.out.println("Número de pessoas que responderam não: " + totalNao);
        System.out.println("Número de mulheres que responderam sim: " + mulheresSim);
        System.out.println("Porcentagem de homens que responderam não: " + porcentagemHomensNao + "%");
        scanner.close();
    }
}

