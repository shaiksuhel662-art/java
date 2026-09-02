import java.util.Random;
import java.util.Scanner;

public class Array1 {
    private int[] arr;
    private int size;

    public Array1(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter value for index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sumRandomElements() {
        Random random = new Random();
        int count;

        if (size >= 4 && random.nextBoolean()) {
            count = 4;
        } else {
            count = 2;
        }

        if (size < 2) {
            System.out.println("Array size is too small to select random elements.");
            return;
        }

        if (size < 4) {
            count = 2;
        }

        boolean[] picked = new boolean[size];
        int sum = 0;

        System.out.println("\nRandomly selected " + count + " elements:");
        for (int i = 0; i < count; i++) {
            int index;
            do {
                index = random.nextInt(size);
            } while (picked[index]);

            picked[index] = true;
            System.out.println("Index " + index + " -> " + arr[index]);
            sum += arr[index];
        }

        System.out.println("Sum of the selected " + count + " elements = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        Array1 obj = new Array1(size);
        obj.readArray();
        obj.sumRandomElements();
    }
}