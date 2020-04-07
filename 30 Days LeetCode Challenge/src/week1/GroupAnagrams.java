class Solution {
    public int getASCII(String inp){
        int sum = 0;
        for(int i=0;i<inp.length();i++){
            sum = sum + inp.charAt(i);    
        }
        return sum;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
 
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(String str: strs){
            char[] arr = new char[26];
            for(int i=0; i<str.length(); i++){
                // a = '97' rest of all the other have more than that because all input are lowercase
                arr[str.charAt(i)-'a']++;
                
            }
            String ns = new String(arr);
            //map is storing key as char arr[] because this will be same for two string having same values
            if(map.containsKey(ns)){
                map.get(ns).add(str);
            }else{
                ArrayList<String> al = new ArrayList<String>();
                al.add(str);
                
                map.put(ns, al);
            }
        }

        result.addAll(map.values());

        return result;
    }
}