import java.util.Scanner;

public class EvenNumberAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int sum = 0;
        int count = 0;
        
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average of even numbers is: " + average);
        } else {
            System.out.println("No even numbers found in the array.");
        }
    }
}
