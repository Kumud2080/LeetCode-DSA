class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        int p = arr.length;
        if(arr.length < 3){
            return false;
        }

        while(i + 1 < p && arr[i] < arr[i+1]){
            i++ ;
        }

        if(i == 0 || i == p-1 ){
            return false; 
        }

        while(i + 1 < p && arr[i] > arr[i + 1]){
            i++;
        }

        return i == p-1;
    }
}