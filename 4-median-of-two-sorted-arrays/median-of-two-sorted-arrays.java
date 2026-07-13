class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length + nums2.length;
        int b = 0;
        int c = 0;
        int[] temp = new int[a];
        int i = 0;
        while(b < nums1.length && c < nums2.length){
            if(nums1[b] >= nums2[c]){
                temp[i] = nums2[c];
                c++;
            }else{
                temp[i] = nums1[b];
                b++;
            }
            i++;
        }

        while(b < nums1.length){
            temp[i] = nums1[b];
            b++;
            i++;
        }

        while(c < nums2.length){
            temp[i] = nums2[c];
            c++;
            i++;
        }

        if( a % 2 == 0){
            double m = (temp[(a - 1) / 2] + temp[a / 2]) / 2.0;
            return m;
        }else{
            double n = temp[Math.round(a/2)];
            return n;
        }
        
    }
}