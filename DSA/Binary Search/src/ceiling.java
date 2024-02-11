import java.util.Scanner;

public class ceiling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr ={5,9,13,15,19,26,28,59,83,99};
        System.out.println("Enter the number");
        int target = in.nextInt();
        int ans =check(arr,target);
        System.out.println(ans);
    }
    static int check(int[] arr, int target){
        int start =0;
        int end =arr.length;
        while (start<= end){
            int mid=start+(end-start)/2;
            if (arr[mid]>target){
                end=mid-1;
            } else {
                start=mid+1;
            }
//            else{
//                for (int j = start; j <end ; j++) {
//                    if(target==arr[j]){
//                        return j;
//                    }
//                    else{
//                        int count=start;
//                        while (arr[count]<target)
//                        }
//                    }
                }
        return arr[start%arr.length];
            }
        }


