import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] arsg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size= sc.nextInt();

        int arr[]=new int[size];
        System.out.print("Enter the elements of array: ");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array in reverse order: ");
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }     
}