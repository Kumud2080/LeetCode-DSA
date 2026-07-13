class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length + nums2.length;
        int m = nums1.length;
        int n = nums2.length;
        int[] temp = new int[a]; 

        for(int i = 0 ; i< m ; i ++){
            temp[i] = nums1[i];
        }

        for(int i = 0 ; i< n ;i++){
            temp[m + i] = nums2[i];
        }

        Arrays.sort(temp);

        if(a % 2 == 0){
            double b = (temp[(a - 1) / 2] + temp[a / 2]) / 2.0;
            return b;
        }else{
            double c = temp[(a/2)];
            return c;
        }
    }
}