class Solution {
    public int lengthOfLastWord(String s) {
        int k = 0;
        boolean started = false;

        for(int i = s.length() - 1; i >=0 ; i--){
            if(s.charAt(i) != ' '){
                started = true;
                k++;
            }else if(started){ 
                break;
            }
        }
        

        return k;
    }
}