import java.util.Scanner;

public class Main{
     public static void main(String[] args) {
         Scanner in= new Scanner(System.in);
         int[] arr ={1,6,12,15,25,27,32,36,39,48,49,56,59,90};
         System.out.println("enter the number to check");
         int target= in.nextInt();
         int ans=check(arr,target);
         System.out.println(ans);
     }
     static int check(int[] arr , int target){
         int start =0;
         int end =arr.length;
         while (start<=end) {
             int mid=start+(end-start)/2;
             if(arr[mid]>target){
                 end=mid-1;
             }
             else if (arr[mid]<target){
                 start = mid+1;

             }
             else {
                 return mid;
             }
         }
        return -1;
     }
 }