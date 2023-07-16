public class PrimeRange  {
    public static int count;
    public static void main(String[] args) {
        Anagram obj= new Anagram();// creating obj for Anagram class
          count=0;
        System.out.println("Prime numbers in the range 0-1000");
        for(int i=1;i<=1000;i++)// for printing prime 1-1000
        {
            if(isprime(i)==true) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("count "+count);
        int arr[]=new int[count];
        int k=0;
        System.out.println("Palindrome prime in the range 0-1000");
        for (int j=1;j<=1000;j++)//for printing palindrome prime 1-1000
        {
            if(isprime(j)==true)
            {
                arr[k]=j;// storing prime values in array for Anagram check
                k++;
                if(ispalin(j)==true)
                    System.out.print(j+" ");
            }
        }
        for(int a=0;a<count;a++)// anagram check of prime no b/w 1-1000
        {
            String s=String.valueOf(arr[a]);
            for(int b=0;b<count;b++)
            {
                if(a!=b) {
                    String s1 = String.valueOf(arr[b]);
                    obj.charArray(s, s1);// calling of anagram check method charArray from Anagram class
                }
            }
        }
    }
   public static boolean isprime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
   }
   public static boolean ispalin(int n) {
       while (n > 9) {
           int num = n;
           int rev = 0;
           while (num > 0) {
               int d = num % 10;
               rev = (rev * 10) + d;
               num = num / 10;
           }
           if (rev == n) {
               return true;
           } else {
               return false;
           }
       }
           return false;

    }
}


