class Solution {
    public int countElements(int[] arr) {
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            hash.add(arr[i]);
            arr[i] = arr[i] + 1;
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(hash.contains(arr[i])){
                count++;    
            }    
        }
        return count;
        
    }
}