import java.util.Scanner;

public class orderAgnostic {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        int[] arr={99,65,45,42,38,35,26,24,15,12,10,9};
        int[] arr={1,3,9,15,35,39,49,58,59,69,88,99};
        int target=in.nextInt();
        int ans= check(arr,target);
        System.out.println(ans);}
    static int check(int [] arr,int target){
        int start =0;
        int end= arr.length;
        if (arr[0]>arr.length-1){
            while (start<=end){
                int mid = start+(end-start)/2;
                if(arr[mid]>target){
                    start=mid+1;
                } else if (arr[mid]<target) {
                    end=mid-1;
                }
                else {return mid;}
            }
        }
        if (arr[0]<arr.length-1){
            while (start<=end){
                int mid = start+(end-start)/2;
                if(arr[mid]<target){
                    start=mid+1;
                } else if (arr[mid]>target) {
                     end=mid-1;
                }
                else {return mid;}
            }
        }
        return -1;
    }
}
