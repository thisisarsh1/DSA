public class rotatedArr {
    public static void main(String[] args) {
    int[] nums = {3,4,5,6,1,2};
    int target = 2;
        System.out.println(search(nums,target));

    }

//    static int search(int[] nums, int target) {
//    int start =0;
//    int end =nums.length-1;
//        if (start == end) {
//            return (nums[start] == target) ? start : -1;
//        }
//    if (pivit(nums)==-1){
//        return check(nums,target,start,end);
//    }
//        int pivotIndex = pivit(nums);
//
//    if(nums[pivotIndex] == target){
//        return pivotIndex;
//    }
//    if (target >= nums[0]){
//        return check(nums,target,0,pivotIndex-1);
//    }
//
//
//            return check(nums,target,pivotIndex+1,end);
//
//
//    }
static int search(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;

    // Handle the case where the array has only one element
    if (start == end) {
        return (nums[start] == target) ? start : -1;
    }

    if (pivit(nums) == -1) {
        return check(nums, target, start, end);
    }

    int pivotIndex = pivit(nums);

    if (nums[pivotIndex] == target) {
        return pivotIndex;
    }

    if (target >= nums[0]) {
        return check(nums, target, start, pivotIndex - 1);
    }

    int result = check(nums, target, pivotIndex + 1, end);
    return (result == -1) ? -1 : result + pivotIndex + 1;
    }


    static int pivit(int[] nums) {
    int start =0;
    int end= nums.length-1;
    while (start<=end){
        int mid= start+(end-start)/2;
        if (mid<end && nums[mid]>nums[mid+1]){
        return mid;
        }
         if (mid>start && nums[mid-1]>nums[mid]){
            return mid-1;
        }
         if(nums[mid]>=nums[start]){
            start=mid+1;
        }
         if(nums[mid]<nums[start]){
             end=mid-1;
         }

    }
        return -1;
    }



    static int check(int[] arr , int target,int start,int end){

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
