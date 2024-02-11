import java.util.Arrays;
import java.util.Scanner;

public class BSA2d {
    public static void main(String[] args) {
        int[][] arr ={
                {1,6,18},
                {4,9,20},
                {7,10,24}
        };
        System.out.println("enter the desired target");
        Scanner in=new Scanner(System.in);
        int target = in.nextInt();
        int[] ans=BSA2d(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] BSA2d(int[][]arr,int target) {
        int r= 0;
        int c= arr.length-1;

        while (r< arr.length && c>=0){
            if(arr[r][c] == target){
                return new int[] {r,c};
            }
            if (arr[r][c]< target){
            r++;
            }
            else{
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
