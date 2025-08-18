//Write an application that collect three input from the user and displays the sum, average, product, smallest and largest numbers


import java.util.Scanner;
public class Tasktwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.print("Enter first number: ");
int num1 = scanner.nextInt();

 System.out.print("Enter second number: ");
int num2 = scanner.nextInt();

System.out.print("Enter third number: ");
int num3 = scanner.nextInt();

int sum = calculateSum(num1, num2, num3);
int average = calculateAverage(sum, 3);
int product = calculateProduct(num1, num2, num3);
int smallest = findSmallest(num1, num2, num3);
int largest = findLargest(num1, num2, num3);

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
        System.out.println("The product is: " + product);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

       
}

    public static int calculateSum(int num1, int num2, int num3) {
        return num1 + num2 + num3;}


    public static int calculateAverage(int sum, int count) {
        return sum / count;}


    public static int calculateProduct(int num1, int num2, int num3) {
        return num1 * num2 * num3;}


    public static int findSmallest(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);}


    public static int findLargest(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);}

}

