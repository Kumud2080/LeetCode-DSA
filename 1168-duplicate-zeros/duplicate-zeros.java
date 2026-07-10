class Solution {
    public void duplicateZeros(int[] arr) {
        int zeroDup = 0;
        int lastIdx = arr.length - 1;

        for(int i = 0 ; i <= lastIdx - zeroDup ; i++){
            if(arr[i] == 0){

                if(i == lastIdx - zeroDup){
                    arr[lastIdx] = 0;
                    lastIdx -= 1; 
                    break;
                }

                zeroDup++;
            }
        }

        int newLastIdx = lastIdx - zeroDup ;

        for(int i = newLastIdx; i >= 0; i--){
            if(arr[i] == 0){
                arr[i + zeroDup] = 0 ;
                zeroDup-- ; 
                arr[i + zeroDup] = 0 ;
            }else{
                arr[i + zeroDup] = arr[i]; 
            }
        }
    }
}