import java.util.*;
public class Bubble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size =sc.nextInt();
        int[] arr =new int[size];
        for(int j=0;j<size;j++)
        {
            arr[j]= sc.nextInt();;
        }
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println("Array in descending order");
        for(int values:arr){
            System.out.print(values+" ");
        }
    }
}
