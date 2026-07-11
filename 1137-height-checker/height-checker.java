class Solution {
    public int heightChecker(int[] heights) {
        int p = heights.length;
        int[] expected = new int[p];
        int k = 0;
        int[] temp = new int[p];

        for(int i = 0; i< p ; i++){
            temp[i] = heights[i];
        }

        Arrays.sort(heights);

        for(int i = 0; i<p ; i++){
            expected[i] = heights[i];
        }

        for(int i = 0 ; i<p ; i++){
            if(expected[i] != temp[i]){
                k++;
            }
        }
        
        return k;
    }
}