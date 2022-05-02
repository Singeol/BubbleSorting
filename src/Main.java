import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int[] bubbleSorting(int[] array) {
        int temp;
        boolean not_sorted = true;
        while (not_sorted) {
            not_sorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    not_sorted = true;
                }
            }
        }
        return (array);
    }

    public static void main(String[] args) {
        Main search = new Main();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(search.bubbleSorting(array)));
    }
}
