import java.util.*;
public class InsertionString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("enter the no of words");
        int size = input.nextInt();
        String names[] = new String[size];
        System.out.println("Enter the array of words ");
        //Load Array
        for (int i = 0; i < size; i++) {
            names[i] = input.nextLine();
        }
        insertionSortAsc(names, size);
        System.out.println("Car manufacturers listed sorted in ascending order (via InsertionSort): ");
        for (int z=0; z < names.length; z++) {
            System.out.println(names[z]);
        }
    }
    public static void insertionSortAsc(String[] names, int n)
    {
        for(int i = 1; i<n; i++)
        {
            insert(names, i);
        }
    }

    public static void insert(String[] names, int i)
    {
        String temp = names[i];
        int j = i - 1;

        while (j >= 0 && names[j].compareToIgnoreCase(temp)  > 0)
        {
            names[j + 1]= names[j];
            j--;
        }
        names[j + 1] = temp;
    }

        }

