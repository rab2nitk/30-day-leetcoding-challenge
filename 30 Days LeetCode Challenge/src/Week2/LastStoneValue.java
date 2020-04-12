class lastStoneValue {
    
    public int lastStoneWeight(int[] stones) {
        // Creating empty priority queue 
        PriorityQueue<Integer> pQueue =  
             new PriorityQueue<Integer>(Collections.reverseOrder()); 
        for(int i=0;i<stones.length;i++){
            pQueue.add(stones[i]);
        }
        while(pQueue.size()>1){
            int Max = pQueue.poll();
            int secondMax = pQueue.poll();
            if(Max!=secondMax){
                int sub = Max-secondMax;
                pQueue.add(sub);
            }
        }
        if(pQueue.size()==0){
            return 0;
        }
        return pQueue.poll();
    }
}