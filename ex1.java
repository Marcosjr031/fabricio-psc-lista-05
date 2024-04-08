
    import java.util.Scanner;
public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;
        int contador = 0;
        
        System.out.println("Digite as idades (digite 0 para encerrar):");

        while (true) {
            int idade = scanner.nextInt();
            if (idade == 0) {
                break;
            }
            somaIdades += idade;
            contador++;
        }
        
        double mediaIdades = (double) somaIdades / contador;
   
        System.out.println("A média das idades é: " + mediaIdades);

        scanner.close();
    }
}


