import java.util.Scanner;
public class Taskeleven {

public static long factorialOf(int num) {
	long factorials = 1;

for (int i = 1; i <= num; i++){
factorials = factorials * i;
}

return factorials;
}

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number :");
int num = scanner.nextInt();
long factorials = factorialOf(num);

System.out.println("The factorial is : " + factorials);

}
}



