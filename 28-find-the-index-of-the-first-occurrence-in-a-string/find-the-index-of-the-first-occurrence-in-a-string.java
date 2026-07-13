class Solution {
    public int strStr(String haystack, String needle) {
        int a = haystack.length();
        int b = needle.length();

        for(int i = 0 ; i <= a - b; i++){
            if(haystack.substring(i , i + b).compareTo(needle) == 0){
                return i;
            }
        }
        return -1;
    }
}