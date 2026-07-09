class Solution {
    public int findNumbers(int[] nums) {
        int positive = 0;

        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;

            do{
                nums[i] = nums[i] / 10;
                count++ ;
            }while(nums[i] > 0);

            if(count % 2 == 0 ){
                positive++ ;
            }
        }
        
        return positive ;
    }
}