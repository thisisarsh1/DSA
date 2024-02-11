public class infiniteArr {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 16, 19, 20, 23, 25, 28, 29, 30, 35, 39, 40, 45, 49, 50, 60, 70, 80, 90};
        int Target = 40;
        System.out.println(ans(Arr,Target));
    }
    static int ans(int[]Arr,int Target)

    {
        int Start, end;
        Start = 0;
        end = 1;
        while (Arr[end] < Target) {
            int newStart = end + 1;
            //end-(start-1) =end -start+1
            end = end + (end - Start + 1) * 2;
            Start = newStart;

        }
        return (BSA(Arr, Target, Start, end));
    }
    static int BSA(int[] Arr,int Target ,int Start , int end){
        while(Start <=end){
            int mid = Start + (end-Start)/2;
            if (Target < Arr[mid]) {
                end = mid - 1;
            }
            else if(Target >Arr[mid]){
                Start=mid+1;
                }
            else{
                return mid;
            }

        }
        return -1;
    }
}
