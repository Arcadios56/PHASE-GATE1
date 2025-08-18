import java.util.Scanner;

public class Taskthree {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter an integer: ");
int number = scanner.nextInt();

if (isDivisibleBy3(number)) {
 System.out.println(number + " is divisible by 3.");

} else {
            System.out.println(number + " is not divisible by 3.");
}      
}

    public static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
}
}


