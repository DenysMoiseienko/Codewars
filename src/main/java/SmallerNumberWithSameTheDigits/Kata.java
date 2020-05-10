package SmallerNumberWithSameTheDigits;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Kata {

    public static long nextSmaller(long n) {

        int[] arr = Long.toString(n).chars().map(c -> c - '0').toArray();
        int pivot = - 1;
        for (int i = arr.length - 1; i > 0; i--){
            if(arr[i] < arr[i - 1]){
                pivot = i - 1;
                break;
            }
        }
        if (pivot == -1) return pivot;
        int min = pivot + 1;
        for (int i = pivot; i < arr.length; i++){
            if (arr[i] < arr[pivot] && arr[i] > arr[pivot + 1]) min = i;
        }
        swap(arr, pivot, min);
        if(arr[0] == 0) return -1;

        int[] firstHalf = Arrays.copyOfRange(arr, 0 , pivot + 1);
        int[] secondHalf = Arrays.copyOfRange(arr, pivot + 1, arr.length);
        secondHalf = IntStream.of(secondHalf).boxed().sorted(Comparator.comparing(
                i -> i == 0 ? 1 : 0)).sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        int[] both = IntStream.concat(IntStream.of(firstHalf), IntStream.of(secondHalf)).toArray();

        StringBuilder result = new StringBuilder();
        for (int digit : both) result.append(digit);

        return Long.parseLong(result.toString());
    }

    static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
