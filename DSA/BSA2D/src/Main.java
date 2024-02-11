import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
int[][] arr ={
        {1,2,3},
        {4,5,6},
        {7,8,9}
};
        System.out.println("enter the desired target");
        Scanner in=new Scanner(System.in);
        int target = in.nextInt();
        int[] ans =  LSA2d(arr,target);
        System.out.println(Arrays.toString(ans));   //imp part

    }
    static int[] LSA2d(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}