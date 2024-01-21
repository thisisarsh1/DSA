import java.util.Arrays;

public class Solution{
    public static void main(String[] args) {


        int ans = max(args);
        System.out.println(ans);
    }
    static int max(int[][] args){
        int count=0;
        int max=0;
        for (int rows = 0; rows < args.length; rows++) {

            for (int cols = 0; cols < args[rows].length; cols++) {
                count =count+args[rows][cols];
            }
            if (max<count){
                max=count;

            }
            count=0;


        }

       return max;
            }
        }

