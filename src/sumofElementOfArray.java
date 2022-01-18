import java.util.Scanner;

public class sumofElementOfArray {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of number");
        int n = sc.nextInt();
        System.out.println("enter element of array ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println("the sum of element of given array "+sum);
    }
}
