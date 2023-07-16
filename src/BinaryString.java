import java.util.*;
public class BinaryString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no of words");
        int size = sc.nextInt();
        System.out.println("Enter the array of words");

        String arr[]=new String[size];
        for (int i=0;i<size;i++){
             arr[i]=sc.nextLine();
        }
        for(int j=0;j<10;j++){
            {
                for(int k=0;k<size-1;k++){
                    if(arr[k+1].compareTo(arr[k])<0){
                        String temp= arr[k];
                        arr[k]=arr[k+1];
                        arr[k+1]=temp;
                    }
                }
            }}
            System.out.println("sorted array of words");
            for(int i=0;i<size;i++)
                System.out.print(arr[i]+" ");



    }
}
