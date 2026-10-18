class Solution {
    public int countCharacters(String[] words, String chars) {
        int ans=0;
        HashMap<Character,Integer> hs=new HashMap<>();
        for(char c:chars.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
        } 
        for(int i=0;i<words.length;i++){
            HashMap<Character,Integer> temp=new HashMap<>(hs);
            boolean good=true;
            int count=0;
            for(char c:words[i].toCharArray()){
                if(temp.getOrDefault(c,0)>0){
                      temp.put(c,temp.get(c)-1);
                      count++;
                }else{
                    good=false;
                    break;
                }
                
            }
            if(good){
                ans+=count;
            }
            
        }
        return ans;
    }
}