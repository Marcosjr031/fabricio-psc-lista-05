public class ex9 {
    public static void main(String[] args) {
        double S = 0.0;
        int numerador = 1000;
        
        for (int i = 1; i <= 50; i++) {

            if (i % 2 == 0) {
                S -= (double) numerador / i;
            } else {
                S += (double) numerador / i;
            }

            numerador -= 3;
        }
        
        System.out.println("A soma dos 50 primeiros termos da série é:"+S);}
}