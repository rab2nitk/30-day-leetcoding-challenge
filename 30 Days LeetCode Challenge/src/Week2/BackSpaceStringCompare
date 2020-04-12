class backspaceCompare {
    public boolean backspaceCompare(String S, String T) {
       Stack st = new Stack();
       Stack tt = new Stack();  
       for(int i=0;i<S.length();i++){
           if(S.charAt(i)=='#'){
                if(!st.isEmpty()){
                    st.pop();
                }    
            }else{
                st.push(S.charAt(i));   
            } 
       }
       
       for(int i=0;i<T.length();i++){
           if(T.charAt(i)=='#'){
                if(!tt.isEmpty()){
                    tt.pop();
                }    
            }else{
                tt.push(T.charAt(i));   
            } 
       }
            String sub = null;
            String nub = null;
            while(!st.isEmpty()){
                sub = sub + st.pop();    
            }
            while(!tt.isEmpty()){
                nub = nub + tt.pop();    
            }
            System.out.println("sub="+sub);
            System.out.println("nub="+nub);
            if(sub == null && nub == null) return true;
            
            if(sub!=null && nub!=null){
                
                if(sub.equalsIgnoreCase(nub)){
                    return true;
                }    
            }
            
        /*if(st.isEmpty()!=tt.isEmpty()) return true;
        else{
            
           
            
            if(sub.equalsIgnoreCase(nub)){
                return true;
            }
                
        }*/
        return false;
    }
}