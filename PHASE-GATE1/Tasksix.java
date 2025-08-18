public class Tasksix{
public static int maximumIn(int[] arr) {
	int max = arr[0];
	for (int index = 1; index < arr.length; index++) {
	if (arr[index] > max) {
	max = arr[index];
}
}
	return max;
}

public static void main(String[] args){
int [] arr = {1, 2, 3, 4, 5};
System.out.println("maximum integer is(are): " + maximumIn(arr));

}
}

