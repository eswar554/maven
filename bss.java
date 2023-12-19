package proj;

import java.util.*;

public class binarySearch {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   
    int a[]=new int[n];
   
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    int key=sc.nextInt();
    binSearch(a,0,n-1,key);
   }
   public static void binSearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;    
      }else if ( arr[mid] == key ){  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
 }  

}

