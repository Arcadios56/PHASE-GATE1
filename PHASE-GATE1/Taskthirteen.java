import java.util.Scanner;

public class Taskthirteen {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a word: ");

String word = scanner.nextLine().toLowerCase();
       
 int vowelCount = 0;
for (char c : word.toCharArray()) {

       if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
}
}
        System.out.println("Vowels: " + vowelCount);
}
}