package topInterview150;

import java.lang.reflect.Array;
import java.util.ArrayList;

//todo use in-place algorithm with swapping no use of extra space,
// remove val from nums then return nums which doesn't contain val
// return nr of elements which are not equal to val
public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        if (val > 100 && nums.length > 100)
            return 0;

        int count= nums.length;

        for (int i = 0; i < count; i++) {

            if (nums[i] <= 0 && nums[i] >= 50)
                return 0;

            if (nums[i] == val) {
                int temp= nums[i];
                nums[i]=nums[count-1];
                nums[count-1]=temp;
                count--;
                i--;
            }
        }
        return count;
    }
}
