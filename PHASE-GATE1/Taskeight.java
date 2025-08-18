public class Taskeight {
    public static int sumOf(int[] arr) {
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
}
        return sum;
}

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of integer is(are): " + sumOf(arr));
}
}
