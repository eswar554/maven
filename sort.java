package proj;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   
    int a[]=new int[n];
   
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j <n; j++) {
            int temp = 0;

            if (a[j] < a[i]) {
 
                temp = a[i];

                a[i] = a[j];

                 a[j] = temp;

            }
        }
        System.out.print(a[i] + " ");
    }
    }
   
}
