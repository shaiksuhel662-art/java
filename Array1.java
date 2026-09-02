
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        Array1 obj = new Array1(size);
        obj.readArray();
    }
}