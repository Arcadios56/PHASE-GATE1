public class Tasknine{
public static int[] maximumAndMinimumOf(int[] arr) {
int min = arr[0];
int max = arr[0];
      
	for(int i = 1; i < arr.length; i++) {

	if (arr[i] < min) {
	min = arr[i];

	}else if (arr[i] > max)
	max = arr[i];

}

    	return new int[] {min, max};        

}
    	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
	int[] result = maximumAndMinimumOf(arr);
   	System.out.println("Minimum number is: " + result[0]);
	System.out.println("Maximum number is: " + result[1]);
   }
}
