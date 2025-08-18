import java.util.Scanner;
public class Taskone {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int num1 = scanner.nextInt();

System.out.print("Enter the second integer: ");
int num2 = scanner.nextInt();

int square1 = calculateSquare(num1);
int square2 = calculateSquare(num2);

 int sumOfSquares = calculateSumOfSquares(square1, square2);
 int differenceOfSquares = calculateDifferenceOfSquares(square1, square2);

System.out.println("The square of " + num1 + " is: " + square1);
System.out.println("The square of " + num2 + " is: " + square2);
System.out.println("The sum of the squares are: " + sumOfSquares);
System.out.println("The difference of the squares (" + num1 + "^2 - " + num2 + "^2) is: " + differenceOfSquares);
}

public static int calculateSquare(int num) {
        return num * num;}

public static int calculateSumOfSquares(int square1, int square2) {
        return square1 + square2;}

public static int calculateDifferenceOfSquares(int square1, int square2) {
        return square1 - square2;}
}

