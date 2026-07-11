class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int p = nums.length;
        int[] arr = new int[p];
        int j = 0;

        for(int i = 0; i < p; i++){
            if(nums[i] % 2 == 0){
                arr[j] = nums[i];
                j++;
            }
        }

        for(int i = 0; i < p ; i++){
            if(nums[i] % 2 != 0){
                arr[j] = nums[i];
                j++;
            }
        }
        
        return arr;
    }
}