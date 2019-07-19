# Test0719
import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=nums.length;
        int point=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i]==nums[i-1]){
               k--;
           }
            else{
                nums[point]=nums[i];
                point++;
            }
           }
            return k;
        }
    }
