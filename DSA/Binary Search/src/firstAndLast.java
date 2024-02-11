public class firstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        ans[0] =check(nums,target,true);
        ans[1] =check(nums,target,false);
        return ans;
    }
    int check (int[] nums , int target , boolean startIndex){
        int ans =-1;
        int start =0;
        int end =nums.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if (nums[mid]<target){
                start = mid+1;

            }
            else {
                if (startIndex){
                    end= mid-1;
                }
                else {
                    start =mid+1;
                }
            }

        }
        return ans;
    }
}
