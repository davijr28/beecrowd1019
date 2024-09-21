import java.util.Scanner;
public class Beecrowd1019 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        int N;
        long hours,minutes,seconds;
        
        //ler a variável
        N = leitor.nextInt();
        
        //converte as unidades de tempo
        hours = N/3600;
        minutes = N/60 - hours*60;
        seconds = N - (minutes*60 + hours*3600);
        
        //mostrar resultado no console
        System.out.printf("%d:%d:%d%n" ,hours,minutes,seconds);
    }
}