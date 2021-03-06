import java.util.Scanner;

public class CountStudentPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a mark for student " + (i + 1) + " ");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        System.out.println("List of mark: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "\t");
            if(array[i] >=5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.println("\n The number of students passing the exam is " + count);
    }
}
