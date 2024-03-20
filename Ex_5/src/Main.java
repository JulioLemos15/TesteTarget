import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String inputString = "Hello, world!";

        
        String invertedString = inverterString(inputString);
        System.out.println("String original: " + inputString);
        System.out.println("String invertida: " + invertedString);
    }

    
    public static String inverterString(String input) {
        
        char[] charArray = input.toCharArray();

        
        int start = 0;
        int end = charArray.length - 1;

        
        while (start < end) {
            
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            
            start++;
            end--;
        }

        
        return new String(charArray);
    }
}
