public class Taskten{
public static int minimumIn(int[] arr) {
    for (int count = 0; count < numbers.length - 1; count++) {
        for (let counter = count + 1; counter < numbers.length; counter++) {
            if (numbers[count] > numbers[counter]) {
                let storeNumber = numbers[counter];
                numbers[counter] = numbers[count];
                numbers[count] = storeNumber;
}
}
}
    return numbers;
}
}



