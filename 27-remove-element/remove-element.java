class Solution {
    public int removeElement(int[] nums, int val) {
        int p = nums.length;
        int k = 0;
        int numVal = 0;

        for(int i = 0 ; i < p ; i++){
            if(nums[i] == val){
                numVal++;
                for(int j = i ; j < p - 1 ; j++){
                    nums[j] = nums[j + 1];
                }
                p--;
                i--;
            }else{
                k++;
            }
        }
        return k;
    }
}