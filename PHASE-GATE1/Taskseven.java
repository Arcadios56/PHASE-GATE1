public class Taskseven{
public static int minimumIn(int[] arr) {
	int min = arr[0];
	for (int index = 1; index < arr.length; index++) {
	if (arr[index] < min) {
	min = arr[index];
}
}
	return min;
}

public static void main(String[] args){
int[] arr = {1, 2, 3, 4, 5};
System.out.println("minimum integer is(are): " + minimumIn(arr));

}
}

