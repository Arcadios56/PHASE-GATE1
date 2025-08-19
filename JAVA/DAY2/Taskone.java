public class Taskone {
public static void main(String[] args) {
        System.out.println(calculateYears(45, 15));
}

public static int calculateYears(int fatherAge, int sonAge) {
return Math.abs(fatherAge - 2 * sonAge) / (2 - 1);
}
}




