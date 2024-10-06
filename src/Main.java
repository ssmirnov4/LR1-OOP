import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вашу строку: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println("\nВведите ваш символ: ");
        String symbol  = sc.nextLine();
        System.out.println("\nВведите какую по счету букву вы хотите заменять: ");
        Scanner scInt = new Scanner(System.in);
        int k = scInt.nextInt();
        String[] newWords = new String[words.length];
        for (int i = 0; i< words.length; i++){
            if (k - 1 < words[i].length()){
                newWords[i] = words[i].substring(0, k-1) + symbol + words[i].substring(k);
            }
            else{
                newWords[i] = words[i];
            }
        }
        String resultStr = String.join(" ", newWords);
        System.out.println(resultStr);
    }
}