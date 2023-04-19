import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Метод для сортировки массива целых чисел методом пузырька
    public int[] bubbleSorting(int[] array) {
        int temp; // временная переменная для обмена элементов местами
        boolean not_sorted = true; // булева переменная для проверки того, отсортирован ли массив
        while (not_sorted) { // повторять проходы по массиву, пока массив не будет отсортирован
            not_sorted = false;
            for (int i = 0; i < array.length - 1; i++) { // проход по массиву
                if (array[i] > array[i + 1]) { // если текущий элемент больше следующего
                    temp = array[i]; // меняем их местами
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    not_sorted = true; // устанавливаем флаг, если совершен обмен элементов
                }
            }
        }
        return (array); // возвращаем отсортированный массив
    }

    public static void main(String[] args) {
        Main search = new Main(); //создаем экземпляр класса Main
        Scanner scanner = new Scanner(System.in); //создаем экземпляр класса Scanner для считывания ввода
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt(); //считываем количество элементов массива
        int[] array = new int[size]; //создаем массив указанного размера
        //цикл заполнения массива
        System.out.print("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); //считываем i-й элемент массива
        }
        //выводим отсортированный массив на экран
        System.out.println("Отсортированный массив: " + Arrays.toString(search.bubbleSorting(array)));
    }
}
