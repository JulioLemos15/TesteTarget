import java.util.Scanner;

public class Main {
    
    static boolean verificaFibonacci(int num) {
        int a = 0, b = 1;
        
        while (b < num) {
            int temp = b;
            b += a;
            a = temp;
        }
        return b == num;
    }

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um n�mero para verificar se pertence � sequ�ncia de Fibonacci: ");
        int numero = scanner.nextInt();
        
        if (verificaFibonacci(numero)) {
            System.out.println(numero + " pertence � sequ�ncia de Fibonacci.");
        } else {
            System.out.println(numero + " n�o pertence � sequ�ncia de Fibonacci.");
        }
        scanner.close();
    }
}

