import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            System.out.println("Digite os primeiros n�meros da sequ�ncia separados por espa�os:");
            String input = scanner.nextLine();

            
            String[] numerosString = input.split(" ");

            
            int[] numeros = new int[numerosString.length];
            for (int i = 0; i < numerosString.length; i++) {
                numeros[i] = Integer.parseInt(numerosString[i]);
            }

            
            int diferenca = numeros[numeros.length - 1] - numeros[numeros.length - 2];

            
            int proximoNumero = numeros[numeros.length - 1] + diferenca;

            
            System.out.println("O pr�ximo n�mero na sequ�ncia �: " + proximoNumero);

            
            System.out.println("Deseja continuar? (S/N)");
            String continuar = scanner.nextLine().toUpperCase();
            if (!continuar.equals("S")) {
                break; 
            }
        }

        scanner.close();
    }
}
