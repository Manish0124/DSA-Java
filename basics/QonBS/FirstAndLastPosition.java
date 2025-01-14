package basics.QonBS;

import java.util.Arrays;

public class FirstAndLastPosition {
    
    public static void main(String[] args) {
        int nums[] = {1 ,2 ,3, 4, 4, 4, 5};
        int target = 12;
        int[] finalAns = SearchRange( nums, target);
        System.out.println(Arrays.toString(finalAns));

    }
     
     public static int[] SearchRange(int[] nums , int target){
        int[] ans = {-1,-1};
        //checks for first occurrence if target first 
        int start = Search(nums , target , true);
        int end = Search(nums, target, false);

        //  ans[0] Search(nums , target , true);
        //if(ans[0]!=-1){
         //  ans[1] = Search(nums, target, false);
        //}
        
        ans[0] = start;
        ans[1] = end;
        return ans;
     }


     //this function just return the index value of target
     static int Search(int[] nums , int target , boolean findStartIndex){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while (start<=end) {
             int mid = start + (end-start)/2;
             if(target<nums[mid]){
                 end = mid - 1;
             }
             else if(target>nums[mid]){
                start = mid+1;
             }
             else {
                //potential ans not found
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
             }
        }

        return ans;
    }
}

