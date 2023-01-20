import java.util.*;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){

        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++){
            set.add(Integer.valueOf(nums[i]));
        }
        /*
         * OR (in for loop)
         * if(set.contains(Integer.valueOf(nums[i]))){
         *      return true;
         * }
         * else{
         *      set.add(Integer.valueOf(nums[i]));
         * }
         * then return false outside of for loop
         */
        if(set.size() == nums.length){
            return false;
        }
        else{
            return true;
        }
    }
}
